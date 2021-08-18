package estudo.java.javacore._25colecoes.test;

import estudo.java.javacore._25colecoes.classes.Produto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {

  public static void main(String[] args) {
    List<Produto> produtos = new LinkedList<>();
    Produto p1 = new Produto("009","Notebook",3500, 0);
    Produto p2 = new Produto("003","Picanha",49.5, 10);
    Produto p3 = new Produto("006","Teclado",400, 5);
    Produto p4 = new Produto("001","Celular",2600, 0);
    produtos.add(p1);
    produtos.add(p2);
    produtos.add(p3);
    produtos.add(p4);
    System.out.println("Quantidade produtos: "+produtos.size());
//    for (Produto produto : produtos){
//      if (produto.getQuantidade()==0){
//          produtos.remove(produto);
//      }
//    }
    Iterator<Produto> produtoIterator = produtos.iterator();
    //hasNext();  next();
    while (produtoIterator.hasNext()){
//      Produto produto = produtoIterator.next();
//      if (produto.getQuantidade()==0){
//        produtoIterator.remove();
      if (produtoIterator.next().getQuantidade()==0){
        produtoIterator.remove();
      }
    }
    System.out.println("Quantidade produtos: "+produtos.size());
  }
}
