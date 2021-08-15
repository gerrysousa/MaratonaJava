package estudo.java.javacore._25colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

  public static void main(String[] args) {
    List<String> nomes = new ArrayList<>();
    nomes.add("Bastião");
    nomes.add("Tião");
    nomes.add("Zé");
    System.out.println("--- Add <Fulano> com indice 0");
    nomes.add(0,"Fulano");
    for (String nome: nomes){
      System.out.println(nome);
    }
    System.out.println("Utilizando o collections para ordenar string...");
    Collections.sort(nomes);
    for (String nome: nomes){
      System.out.println(nome);
    }

    List<Double> numeros = new ArrayList<>();
    numeros.add(1.5);
    numeros.add(1.3);
    numeros.add(1.9);
    numeros.add(1.0);
    System.out.println("Ordem de add");
    for (Double num: numeros){
      System.out.println(num);
    }
    System.out.println("Utilizando o collections para ordenar numeros...");
    Collections.sort(numeros);
    for (Double num: numeros){
      System.out.println(num);
    }
  }
}
