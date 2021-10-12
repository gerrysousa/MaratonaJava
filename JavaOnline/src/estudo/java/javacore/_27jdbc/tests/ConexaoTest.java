package estudo.java.javacore._27jdbc.tests;

import estudo.java.javacore._27jdbc.conn.ConexaoFactory;

public class ConexaoTest {

  public static void main(String[] args) {
    ConexaoFactory conn = new ConexaoFactory();
    conn.getConexao();
  }
}
