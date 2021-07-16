package estudo.java.javacore._13interfaces.test;

import estudo.java.javacore._13interfaces.classes.Produto;

public class ProdutoTest {

  public static void main(String[] args) {
    Produto p1 = new Produto("Notebook", 4, 3000);
    p1.calculaImposto();
    p1.calculaFrete();
    System.out.println(p1);
  }
}
