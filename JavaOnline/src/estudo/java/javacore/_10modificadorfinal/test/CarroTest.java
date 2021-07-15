package estudo.java.javacore._10modificadorfinal.test;

import estudo.java.javacore._10modificadorfinal.classes.Carro;

public class CarroTest {

  public static void main(String[] args) {
    Carro c1 = new Carro();
    System.out.println(c1.getComprador());

    c1.getComprador().setNome("Fulano");
    System.out.println(c1.getComprador());
  }
}
