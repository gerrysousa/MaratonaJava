package estudo.java.javacore._27jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
  //java.sql = Connection, Statement, ResultSet
  //DriverManager
  public Connection getConexao(){
    String url = "jdbc:mysql://localhost/agencia?allowPublicKeyRetrieval=true&useSSL=false&useTimezone=true&serverTimezone=UTC";
    String user= "user";
    String password= "password";
    try{
      //Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager.getConnection(url, user, password);
      System.out.println(connection);
      return connection;
    }catch (SQLException e){
      e.printStackTrace();
    }
    return null;
  }


}
