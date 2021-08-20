package estudo.java.javacore._25colecoes.test;

import estudo.java.javacore._25colecoes.classes.Consumidor;
import estudo.java.javacore._25colecoes.classes.Produto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {

  public static void main(String[] args) {
    Consumidor cons1 = new Consumidor("001", "Bastião");
    Consumidor cons2 = new Consumidor("002", "Zé das Couves");

    Produto p1 = new Produto("009","Notebook",3500);
    Produto p2 = new Produto("003","Picanha",49.5);
    Produto p3 = new Produto("006","Teclado",400);
    Produto p4 = new Produto("001","Celular",2600);

    List<Produto> produtoListCons1 = new ArrayList<>();
    produtoListCons1.add(p1);
    produtoListCons1.add(p3);
    List<Produto> produtoListCons2 = new ArrayList<>();
    produtoListCons2.add(p2);
    produtoListCons2.add(p4);

    Map<Consumidor, List<Produto>> map = new HashMap<>();
    map.put(cons1, produtoListCons1);
    map.put(cons2, produtoListCons2);

    for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()){
      System.out.println("++++++++++++++++"+entry.getKey().getNome());
      for (Produto produto : entry.getValue()){
        System.out.println(produto.getNome());
      }

    }
  }
}
