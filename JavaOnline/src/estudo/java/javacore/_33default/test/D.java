package estudo.java.javacore._33default.test;

import estudo.java.javacore._33default.interfaces.A;
import estudo.java.javacore._33default.interfaces.B;
import estudo.java.javacore._33default.interfaces.E;

public class D implements A, E {

  public static void main(String[] args) {
    new D().oi();//vai exibir o mais que for implementado pois existem dois oi default
  }

  @Override
  public void oi() {
    A.super.oi();
  }
}

