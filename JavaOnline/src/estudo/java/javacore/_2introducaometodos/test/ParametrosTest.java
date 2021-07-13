package estudo.java.javacore._2introducaometodos.test;

import estudo.java.javacore._2introducaometodos.classes.Calculadora;

public class ParametrosTest {

  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    int num1 = 10;
    int num2 = 5;
    calc.alteraDoisNumeros(num1, num2);
    System.out.println("Dentro do teste");
    System.out.println("num1: "+num1);
    System.out.println("num2: "+num2);
  }
}
