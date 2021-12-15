package estudo.java.javacore._33default.test;

import estudo.java.javacore._33default.interfaces.A;
import estudo.java.javacore._33default.interfaces.B;

public class C implements A, B {

  public static void main(String[] args) {
    new C().oi();//vai exibir o mais especifico no caso foi o B pois ele extende o A
  }
}
