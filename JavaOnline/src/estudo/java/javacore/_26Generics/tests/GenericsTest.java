package estudo.java.javacore._26Generics.tests;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

  public static void main(String[] args) {
    /***
     Generics só funciona em tempo de compilação
     */


    // type erasure
    List<String> lista = new ArrayList<>();
    lista.add("String 1");
    lista.add("String 2");
    lista.add("String 3");

    for (String obj : lista) {
      System.out.println(obj);
    }
    add(lista, 1L);
//Ao compilar com o codigo abaixo teremos um erro em tempo de execução
//    for (String obj : lista) {
//      System.out.println(obj);
//    }
  }

  public static void add(List lista, Long l) {
    lista.add(l);
  }
}
