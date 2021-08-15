package estudo.java.javacore._25colecoes.test;

import estudo.java.javacore._25colecoes.classes.Celular;
import java.util.ArrayList;
import java.util.List;

public class ListTest {

  public static void main(String[] args) {
    List<String> nomes = new ArrayList<String>();
    nomes.add("Bastião");
    nomes.add("Zé das Couves");
    nomes.add("Tião");

    for (String nome : nomes){
      System.out.println(nome);
    }
    nomes.add("Fulano");
    System.out.println("======== ArrayList pode Crescer dinamicamente ===================");
    for (String nome : nomes){
      System.out.println(nome);
    }
    System.out.println("--- Removendo por index do ArrayLists: "+nomes.remove(0));

    for (String nome : nomes){
      System.out.println(nome);
    }
    System.out.println("--- Removendo por objeto do ArrayLists: "+nomes.remove("Tião"));

    for (String nome : nomes){
      System.out.println(nome);
    }
    System.out.println("---------------------");
    System.out.println("Não permite criar arraylist com os tipos primitivos");
    System.out.println("Ex.: List<int> nomes = new ArrayList<int>();");

    List<Integer> numeros = new ArrayList<Integer>();
    numeros.add(10);
    numeros.add(20);
    numeros.add(25);
    numeros.add(30);
    for (Integer numero : numeros){
      System.out.println(numero);
    }

    //ArrayList que aceita qualquer coisa
    List listdeQualquerCoisa = new ArrayList<>();
    listdeQualquerCoisa.add("String");
    listdeQualquerCoisa.add(10);
    listdeQualquerCoisa.add(new Celular("moto", "123456"));

    List<String> nomes2 = new ArrayList<String>();
    nomes2.add("Bastião2");
    nomes2.add("Zé das Couves2");
    nomes2.add("Tião2");
    System.out.println("Array de nomes2 =======");
    for (String nome : nomes2){
      System.out.println(nome);
    }
    System.out.println("--- Concatenar dois arrays");
    nomes2.addAll(nomes);
    for (String nome : nomes2){
      System.out.println(nome);
    }

  }
}
