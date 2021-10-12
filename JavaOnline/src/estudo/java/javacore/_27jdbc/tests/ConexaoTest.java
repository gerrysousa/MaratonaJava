package estudo.java.javacore._27jdbc.tests;

import estudo.java.javacore._27jdbc.classes.Comprador;
import estudo.java.javacore._27jdbc.conn.ConexaoFactory;
import estudo.java.javacore._27jdbc.db.CompradorDB;

public class ConexaoTest {

  public static void main(String[] args) {
    Comprador comprador = new Comprador("111.111.111-22", "Bastião");
    CompradorDB compradorDB = new CompradorDB();
    compradorDB.save(comprador);

//    ConexaoFactory conn = new ConexaoFactory();
//    conn.getConexao();
  }
}
