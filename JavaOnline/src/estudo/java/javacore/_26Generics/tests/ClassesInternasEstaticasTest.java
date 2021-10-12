package estudo.java.javacore._26Generics.tests;

import estudo.java.javacore._26Generics.tests.Externa.Interna;

class Externa{
  static class Interna{
    public void imprimir(){
      System.out.println("Dentro da classe interna");
    }
  }
}

public class ClassesInternasEstaticasTest {

  public static void main(String[] args) {
    Externa.Interna interna1 = new Externa.Interna();
    interna1.imprimir();

    Interna2 interna2 = new Interna2();
    interna2.imprimir();

  }

  static class Interna2{
    public void imprimir(){
      System.out.println("Dentro da classe interna 2");
    }
  }
}
