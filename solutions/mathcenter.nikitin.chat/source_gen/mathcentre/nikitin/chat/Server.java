package mathcentre.nikitin.chat;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import swiftteams.nikitin.sql.runtime.TableRow;
import swiftteams.nikitin.sql.runtime.ArrayListCreator;
import swiftteams.nikitin.sql.runtime.ConnectionManager;
import java.sql.Timestamp;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.sql.SQLException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  private static List<ServerThread> clients = new LinkedList<ServerThread>();
  private static Set<String> names = new HashSet<String>();

  public Server() {
  }

  public static void notityAllClients(String line, String from) {
    try {
      List<TableRow> t = ArrayListCreator.create(ConnectionManager.query("SELECT   " + "" + "CURRENT_TIMESTAMP AS timestamp" + " FROM " + "" + "history" + "   "));
      Timestamp timestamp = ((Timestamp)ListSequence.fromList(t).first().getProperty("timestamp"));
      ConnectionManager.update("INSERT " + "INTO history (" + "" + "login,message,timestamp" + ")" + " VALUES" + "" + "(" + "" + "'" + "" + from + "'" + "," + "'" + "" + line + "'" + "," + "'" + "" + timestamp + "'" + ")");
      synchronized(clients) {
        for(ServerThread client : clients) {
          client.sendLine(getTime(timestamp) + " " + from + Const.separator + line);
        }
      }
    } catch (SQLException se) {
      se.printStackTrace();
    }
  }

  public static boolean addClientName(String name, String suffix) {
    synchronized(names) {
      if (names.contains(name)) {
        Server.notityAllClients(Const.prefix + name + Const.threatNotify, Const.serverMsg);
        return false;
      } else
      {
        names.add(name);
        Server.notityAllClients(Const.prefix + name + Const.enterNotify, Const.serverMsg);
        System.out.println("client entered: " + name + suffix);
        return true;
      }
    }
  }

  public static void remClientName(String name) {
    synchronized(names) {
      if (name != null) {
        names.remove(name);
        Server.notityAllClients(Const.prefix + name + Const.leaveNotify, Const.serverMsg);
        System.out.println("client exited: " + name);
      }
    }
  }

  public static void main(String[] args) throws IOException, SQLException {
    ConnectionManager.setConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/chat", "Morj", "abacaba");
    ServerSocket serverSocket = null;
    boolean listening = true;
    try {
      serverSocket = new ServerSocket(Const.serverPort);
    } catch (IOException e) {
      System.out.println("Could not listen on port: " + Const.serverPort);
      System.exit(-1);
    }
    System.out.println("MPS Server started...");
    while (listening) {
      Socket incoming = serverSocket.accept();
      ServerThread client = new ServerThread(incoming);
      clients.add(client);
      client.start();
    }
    ConnectionManager.shutdown();
  }

  public static String getTime(Timestamp t) {
    String s = t.toString();
    return s.substring(0, s.lastIndexOf('.'));
  }

}
