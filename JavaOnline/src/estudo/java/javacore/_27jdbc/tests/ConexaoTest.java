package estudo.java.javacore._27jdbc.tests;

import estudo.java.javacore._27jdbc.classes.Comprador;
import estudo.java.javacore._27jdbc.db.CompradorDB;
import java.util.List;

public class ConexaoTest {

  public static void main(String[] args) {
//    inserir();
//    atualizar();
//    deletar();
//    List<Comprador> compradorList = selecionarTudo();
//    System.out.println(compradorList);
//    List<Comprador> compradorList2 = selecionarPorNome("galinha");
//    System.out.println(compradorList2);
    //CompradorDB.selectMetaData();
    CompradorDB.checkDriverStatus();
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

  public static List<Comprador> selecionarTudo() {
    return CompradorDB.selectAll();
  }

  public static List<Comprador> selecionarPorNome(String nome) {
    return CompradorDB.searchByName(nome);
  }
}
