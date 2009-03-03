package mathcentre.nikitin.chat;

/*Generated by MPS */

import swiftteams.nikitin.sql.runtime.ConnectionManager;
import java.sql.SQLException;

public class Schema {

  public static void main(String[] args) {
    try {
      ConnectionManager.setConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/chat", "Morj", "abacaba");
      ConnectionManager.update("DROP TABLE history");
      ConnectionManager.update("CREATE TABLE " + "history" + "(" + "login" + " " + "VARCHAR (256)" + " DEFAULT ''" + ",\n            " + "message" + " " + "VARCHAR (4096)" + " DEFAULT ''" + ",\n            " + "timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP" + ",\n            " + "PRIMARY KEY (" + "" + "login,timestamp" + ")" + ")");
      ConnectionManager.update("INSERT " + "INTO history (" + "" + "login,message" + ")" + " VALUES" + "" + "(" + "" + "'Morj','test'" + ")");
      ConnectionManager.shutdown();
      System.out.println("database init successfully done!");
    } catch (SQLException se) {
      System.out.print("database init error:");
      se.printStackTrace();
    }
  }

}
