package estudo.java.javacore._25colecoes.test;

import estudo.java.javacore._25colecoes.classes.Produto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProdutoNomeComparator implements Comparator<Produto>{
  @Override
  public int compare(Produto p1, Produto p2) {
    return p1.getNome().compareTo(p2.getNome());
  }
}

public class SortProdutoTest {

  public static void main(String[] args) {
    List<Produto> produtos = new ArrayList<>();
    Produto p1 = new Produto("009","Notebook",3500);
    Produto p2 = new Produto("003","Picanha",49.5);
    Produto p3 = new Produto("006","Teclado",400);
    Produto p4 = new Produto("001","Celular",2600);
    produtos.add(p1);
    produtos.add(p2);
    produtos.add(p3);
    produtos.add(p4);
    System.out.println("Imprimindo na ordem de add");
    for (Produto produto : produtos){
      System.out.println(produto);
    }
    System.out.println("Imprimindo ordenado pelo compareTo da classe produto");
    Collections.sort(produtos);
    for (Produto produto : produtos){
      System.out.println(produto);
    }

    System.out.println("------------------------------");
    Produto[] produtosArray = new Produto[4];
    produtosArray[0]= p1;
    produtosArray[1]= p2;
    produtosArray[2]= p3;
    produtosArray[3]= p4;

    System.out.println(Arrays.toString(produtosArray));
    Arrays.sort(produtosArray);
    System.out.println("Ordenado pelo critério do metodo compareTo da Classe Produto");
    for (Produto produto : produtosArray){
      System.out.println(produto);
    }

    System.out.println("Ordenado pelo critério do metodo compare da Classe ProdutoNomeComparator");
    Arrays.sort(produtosArray, new ProdutoNomeComparator());
    for (Produto produto : produtosArray){
      System.out.println(produto);
    }
  }
}
