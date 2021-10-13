package estudo.java.javacore._27jdbc.tests;

import estudo.java.javacore._27jdbc.classes.Comprador;
import estudo.java.javacore._27jdbc.conn.ConexaoFactory;
import estudo.java.javacore._27jdbc.db.CompradorDB;

public class ConexaoTest {

  public static void main(String[] args) {
//    inserir();
//    atualizar();
    deletar();
  }

  public static void inserir() {
    Comprador comprador = new Comprador("333.111.111-22", "Bastião tests");
    CompradorDB.save(comprador);
  }

  public static void atualizar() {
    Comprador comprador = new Comprador(2, "444.111.111-22", "Bastião das galinhas");
    CompradorDB.update(comprador);
  }

  public static void deletar() {
    Comprador comprador = new Comprador();
    comprador.setId(3);
    CompradorDB.delete(comprador);
  }
}
