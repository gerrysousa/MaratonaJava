package estudo.java.javacore._25colecoes.test;

import estudo.java.javacore._25colecoes.classes.Produto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();
    numeros.add(2);
    numeros.add(0);
    numeros.add(5);
    numeros.add(4);
    /**
     Atenção: A coleção deve estar ordenada para o binarySearch funcionar corretamente.
     A procura com Collections.binarySearch retorna o indice do objeto procurado.
     Se não encontrar retorna o ponto de inserção seguindo essa regra "(-(ponto de inserção)-1)"
     **/
    Collections.sort(numeros);
    /**
     Depois do sort temos.
     Index: 0,1,2,3
     value: 0,2,3,4
     **/
    System.out.println("Onde está o valor 2: index > "+Collections.binarySearch(numeros,2));
    System.out.println("Onde deveria ser inserido o valor 1: index > "+Collections.binarySearch(numeros,1));//-1 -1= -2


    List<Produto> produtos = new ArrayList<>();
    Produto p1 = new Produto("009","Notebook",3500);
    Produto p2 = new Produto("003","Picanha",49.5);
    Produto p3 = new Produto("006","Teclado",400);
    Produto p4 = new Produto("001","Celular",2600);
    produtos.add(p1);
    produtos.add(p2);
    produtos.add(p3);
    produtos.add(p4);

    System.out.println("Ordenado pelo critério do metodo compare da Classe ProdutoNomeComparator");
    Collections.sort(produtos, new ProdutoNomeComparator());
    for (Produto produto : produtos){
      System.out.println(produto);
    }
    Produto p5 = new Produto("000","Antena",150);

    System.out.println("Onde deveria ser inserido o produto 5: index > "+Collections.binarySearch(produtos,p5, new ProdutoNomeComparator()));

    Integer[] arrayInteger = new Integer[4];
    arrayInteger[0]=2;
    arrayInteger[1]=0;
    arrayInteger[2]=5;
    arrayInteger[3]=4;
    Arrays.sort(arrayInteger);
    System.out.println("Onde está o valor 2: index > "+Arrays.binarySearch(arrayInteger, 2));
    System.out.println("Onde deveria ser inserido o valor 3: index > "+Arrays.binarySearch(arrayInteger, 3));

  }
}
