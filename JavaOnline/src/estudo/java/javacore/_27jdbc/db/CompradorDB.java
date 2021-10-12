package estudo.java.javacore._27jdbc.db;

import estudo.java.javacore._27jdbc.classes.Comprador;
import estudo.java.javacore._27jdbc.conn.ConexaoFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CompradorDB {

  public void save(Comprador comprador) {
    String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('"+comprador.getCpf()+"', '"+comprador.getNome()+"');";
    Connection conn = ConexaoFactory.getConexao();
    try {
      Statement stmt = conn.createStatement();
      System.out.println(stmt.executeUpdate(sql));
    }catch (SQLException e){
      e.printStackTrace();
    }
  }
}
