package estudo.java.javacore._25colecoes.test;

import estudo.java.javacore._25colecoes.classes.Celular;
import estudo.java.javacore._25colecoes.classes.Produto;
import java.util.Comparator;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

class CelularNomeComparator implements Comparator<Celular>{
  @Override
  public int compare(Celular o1, Celular o2) {
    return o1.getNome().compareTo(o2.getNome());
  }
}

public class TreeSetTest {

  public static void main(String[] args) {
    Produto p1 = new Produto("009","Notebook",3500, 0);
    Produto p2 = new Produto("003","Picanha",49.5, 10);
    Produto p3 = new Produto("006","Teclado",400, 5);
    Produto p4 = new Produto("001","Celular",2600, 0);
    Produto p5 = new Produto("001","Celular",2600, 0);
    Celular c1 = new Celular("Moto g2", "0001");

    System.out.println("Para utilizar NavigableSet/TreeSet os objetos devem implementar Comparable. Ou deve-se passar um Comparator do odjeto.");
    NavigableSet<Celular> celularNavigableSet = new TreeSet<>(new CelularNomeComparator());
    celularNavigableSet.add(c1);
    for (Celular celular : celularNavigableSet){
      System.out.println(celular);
    }

    NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
    produtoNavigableSet.add(p1);
    produtoNavigableSet.add(p2);
    produtoNavigableSet.add(p3);
    produtoNavigableSet.add(p4);
    produtoNavigableSet.add(p5);

    for (Produto produto : produtoNavigableSet){
      System.out.println(produto);
    }
    System.out.println("----------------------------");
    System.out.println("lower < : primeiro produto menor antes do p4 "+ produtoNavigableSet.lower(p4));
    System.out.println("floor <= : primeiro produto menot antes do p4 incluindo p4"+ produtoNavigableSet.floor(p4));
    System.out.println("higher > : primeiro produto maior depois do p4 "+ produtoNavigableSet.higher(p4));
    System.out.println("ceiling >= : primeiro produto maior depois do p4 incluindo p4 "+ produtoNavigableSet.ceiling(p4));

    System.out.println("Lista na ordem inversa <descendingSet>");
    for (Produto produto : produtoNavigableSet.descendingSet()){
      System.out.println(produto);
    }
    System.out.println("Retorna o primeiro elemento e remove da lista: "+produtoNavigableSet.pollFirst());
    System.out.println("Retorna o ultimo elemento e remove da lista: "+produtoNavigableSet.pollLast());
    System.out.println("----------------------------");
    for (Produto produto : produtoNavigableSet){
      System.out.println(produto);
    }

  }
}
