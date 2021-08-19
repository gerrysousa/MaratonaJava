package estudo.java.javacore._25colecoes.test;

import estudo.java.javacore._25colecoes.classes.Produto;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

  public static void main(String[] args) {
    Produto p1 = new Produto("009","Notebook",3500, 0);
    Produto p2 = new Produto("003","Picanha",49.5, 10);
    Produto p3 = new Produto("006","Teclado",400, 5);
    Produto p4 = new Produto("001","Celular",2600, 0);
    Produto p5 = new Produto("001","Celular",2600, 0);

    Set<Produto> produtoSet = new HashSet<>();
    produtoSet.add(p1);
    produtoSet.add(p2);
    produtoSet.add(p3);
    produtoSet.add(p4);
    produtoSet.add(p5);

    System.out.println("HashSet não tem indice, List tem indice");
    System.out.println("HashSet não inclui objetos duplicados no array, List permite duplicados");
    System.out.println("HashSet não inclui objetos em ordem");
    for (Produto produto : produtoSet){
      System.out.println(produto);
    }

    System.out.println("Caso queira que fique na ordem de inserção usar o LinkedHashSet");
    Set<Produto> produtoSet2 = new LinkedHashSet<>();
    produtoSet2.add(p1);
    produtoSet2.add(p2);
    produtoSet2.add(p3);
    produtoSet2.add(p4);

    for (Produto produto : produtoSet2){
      System.out.println(produto);
    }
  }
}
