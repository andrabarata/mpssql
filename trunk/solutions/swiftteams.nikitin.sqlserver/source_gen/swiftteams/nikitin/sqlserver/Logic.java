package swiftteams.nikitin.sqlserver;

/*Generated by MPS */

import java.sql.SQLException;
import java.util.List;
import swiftteams.nikitin.sql.runtime.TableRow;
import swiftteams.nikitin.sql.runtime.ArrayListCreator;
import swiftteams.nikitin.sql.runtime.ConnectionManager;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import swiftteams.nikitin.sql.runtime.TableRowExtractor;
import java.sql.Timestamp;

public class Logic implements ILogic {

  public Logic() {
  }

  public int login(String login, int pw_hash) throws SQLException {
    List<TableRow> t = ArrayListCreator.create(ConnectionManager.query("SELECT   " + "" + "accounts.id" + " FROM " + "" + "accounts" + " WHERE " + "" + "(" + "" + "accounts.login" + " =" + " " + "'" + "" + login + "'" + ") AND (" + "" + "accounts.pw_hash" + " =" + " " + pw_hash + ")" + "  "));
    System.out.println("login: " + login);
    if (ListSequence.fromList(t).isEmpty()) {
      System.out.println("no such user or incorrect password!");
      return 0;
    } else
    {
      int user_id = ((Integer)ListSequence.fromList(t).first().getProperty("id"));
      int timestamps_count = ConnectionManager.update("INSERT " + "INTO stats (" + "" + "id,action" + ")" + " VALUES" + "" + "(" + "" + user_id + ",'login'" + ")");
      System.out.println(login + " logged in, id: " + user_id + ", timestamps added: " + timestamps_count);
      return user_id;
    }
  }

  public void logout(int user_id) throws SQLException {
    List<TableRow> test = ListOperations.<TableRow>createList();
    for(char n = 'A' ; n <= 'C' ; n++ ) {
      ListSequence.fromList(test).addElement(new TableRow(new String[]{"id","action"}, new Object[]{user_id,"logout " + n}));
    }
    System.out.println("logout: " + user_id + ", timestamps added: " + ConnectionManager.update("INSERT " + "INTO stats (" + "" + "id,action" + ")" + " VALUES" + "" + TableRowExtractor.getPresentation(test, new String[]{"id","action"})));
  }

  public List<TableRow> userStats(int id) throws SQLException {
    return ArrayListCreator.create(ConnectionManager.query("SELECT   " + "" + "stats.action" + "," + "stats.timestamp" + " FROM " + "" + "stats" + " WHERE " + "" + "stats.id" + " =" + " " + id + "  "));
  }

  public boolean isAdmin(int id) throws SQLException {
    List<TableRow> t = ArrayListCreator.create(ConnectionManager.query("SELECT   " + "" + "admins.id" + " FROM " + "" + "admins" + " WHERE " + "" + "admins.id" + " =" + " " + id + "  "));
    return ListSequence.fromList(t).isEmpty();
  }

  public List<TableRow> usersList() throws SQLException {
    return ArrayListCreator.create(ConnectionManager.query("SELECT   " + "" + "accounts.id" + "," + "accounts.login" + " FROM " + "" + "accounts" + "   "));
  }

  public void deleteUser(int id) throws SQLException {
    ConnectionManager.update("DELETE FROM admins WHERE " + "" + "admins.id" + " =" + " " + id);
    ConnectionManager.update("DELETE FROM stats WHERE " + "" + "stats.id" + " =" + " " + id);
    ConnectionManager.update("DELETE FROM accounts WHERE " + "" + "accounts.id" + " =" + " " + id);
  }

  public void createUser(int id, String login, int pw_hash) throws SQLException {
    ConnectionManager.update("INSERT " + "INTO accounts (" + "" + "id,login,pw_hash" + ")" + " VALUES" + "" + "(" + "" + id + "," + "'" + "" + login + "'" + "," + pw_hash + ")");
  }

  public List<TableRow> allStats() throws SQLException {
    return ArrayListCreator.create(ConnectionManager.query("SELECT   " + "" + "accounts.login" + "," + "stats.timestamp" + "," + "stats.action" + " FROM " + "" + "stats   JOIN\n    accounts ON" + " " + "stats.id" + " =" + " " + "accounts.id" + "   " + "" + "ORDER BY" + " " + "stats.timestamp"));
  }

  private void loginTest(int id) {
    try {
      this.login("user" + id, id);
    } catch (SQLException se) {
      se.printStackTrace();
    }
  }

  private void createTest(int id) {
    try {
      this.createUser(id, "user" + id, id);
    } catch (SQLException se) {
      se.printStackTrace();
    }
  }


  public static void main(String[] args) {
    try {
      ConnectionManager.setConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/server", "Morj", "mrj");
      Logic logic = new Logic();
      logic.createTest(3);
      logic.logout(1);
      logic.loginTest(3);
      System.out.println("\nstats for: user1");
      for(TableRow stat : ListSequence.fromList(logic.userStats(3))) {
        System.out.println("on " + ((Timestamp)stat.getProperty("timestamp")) + " - " + ((String)stat.getProperty("action")));
      }
      System.out.println("\nall stats:");
      for(TableRow stat : ListSequence.fromList(logic.allStats())) {
        System.out.println("on: " + ((Timestamp)stat.getProperty("timestamp")) + " user " + ((String)stat.getProperty("login")) + " did " + ((String)stat.getProperty("action")));
      }
      System.out.println("\ndelete user: 3");
      logic.deleteUser(3);
      System.out.println("\nusers list:");
      for(TableRow user : ListSequence.fromList(logic.usersList())) {
        System.out.println("id: " + ((Integer)user.getProperty("id")) + ", login: " + ((String)user.getProperty("login")));
      }
      ConnectionManager.shutdown();
    } catch (SQLException se) {
      System.out.println("test failed!");
      se.printStackTrace();
    }
  }

}
