package estudo.java.javacore._27jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoFactory {

  //java.sql = Connection, Statement, ResultSet
  //DriverManager
  public static Connection getConexao() {
    String url = "jdbc:mysql://localhost/agencia?allowPublicKeyRetrieval=true&useSSL=false&useTimezone=true&serverTimezone=UTC";
    String user = "user";
    String password = "password";
    try {
      //Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager.getConnection(url, user, password);
      System.out.println(connection);
      return connection;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void close(Connection connection) {
    try {
      if (connection != null) {
        connection.close();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void close(Connection connection, Statement statement) {
    close(connection);
    try {
      if (statement != null) {
        statement.close();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void close(Connection connection, Statement statement, ResultSet rs) {
    close(connection, statement);
    try {
      if (rs != null) {
        rs.close();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
