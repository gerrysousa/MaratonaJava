package estudo.java.javacore._27jdbc.tests;

import estudo.java.javacore._27jdbc.classes.Comprador;
import estudo.java.javacore._27jdbc.db.CompradorDAO;
import estudo.java.javacore._27jdbc.db.CompradorDB_OLD;
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
    //CompradorDB.checkDriverStatus();
    //CompradorDB.testTypeScroll();
   // CompradorDB.updateNomesToLowerCase();
    //CompradorDB.inserirRegistros();
    //CompradorDB.deletarRegistros();

    //CompradorDB.updatePreparedStatement(new Comprador(5,"555.555.555-00", "Cicrano updatePreparedStatement"));
    //System.out.println(CompradorDB.searchByNameCallableStatement("bas"));
  // System.out.println(CompradorDB.searchByNameRowSet("bas"));
  //  CompradorDB.updateRowSet(new Comprador(5,"555.555.555-11", "Cicrano updateRowSet"));
    //CompradorDB.updateRowSetCached(new Comprador(5,"555.555.555-22", "Cicrano updateRowSetCached"));

//   List<Comprador> compradorList = CompradorDAO.selectAll();
//    System.out.println(compradorList);

    CompradorDAO.update(new Comprador(5,"444.444.444-11", "Fulano novo"));

    try {
      CompradorDB_OLD.saveTransaction();
    }catch (Exception e){

    }

  }

  public static void inserir() {
    Comprador comprador = new Comprador("333.111.111-22", "Bastião tests");
    CompradorDB_OLD.save(comprador);
  }

  public static void atualizar() {
    Comprador comprador = new Comprador(2, "444.111.111-22", "Bastião das galinhas");
    CompradorDB_OLD.update(comprador);
  }

  public static void deletar() {
    Comprador comprador = new Comprador();
    comprador.setId(3);
    CompradorDB_OLD.delete(comprador);
  }

  public static List<Comprador> selecionarTudo() {
    return CompradorDB_OLD.selectAll();
  }

  public static List<Comprador> selecionarPorNome(String nome) {
    return CompradorDB_OLD.searchByName(nome);
  }
}
