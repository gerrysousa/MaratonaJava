package estudo.java.javacore._14polimorfismo.test;

import estudo.java.javacore._14polimorfismo.classes.ArquivoDAOImp;
import estudo.java.javacore._14polimorfismo.classes.DatabaseDAOImp;
import estudo.java.javacore._14polimorfismo.classes.GenericDAO;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jdk.dynalink.linker.LinkerServices;

public class DAOTest {

  public static void main(String[] args) {
    //ArquivoDAOImp arquivoDAOImp = new ArquivoDAOImp(); // Melhor utilizar a classe generica -> GenericDAO arquivoDAOImp = new ArquivoDAOImp();
    GenericDAO arquivoDAOImp = new ArquivoDAOImp();
    arquivoDAOImp.save();

    GenericDAO arquivoDAOImp2 = new DatabaseDAOImp();
    arquivoDAOImp2.save();

    List<String> lista = new ArrayList<>();//da no mesmo utilizar, só muda a implementacao --> List<String> lista = new LinkedList<>();

    lista.add("Item 1");
    lista.add("Item 2");
    lista.add("Item 3");
    lista.add("Item 4");

    for (String item : lista){
      System.out.println(item);
    }


  }
}
