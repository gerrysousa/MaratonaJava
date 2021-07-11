package estudo.java.javacore.introducaometodos.test;

import estudo.java.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    calc.somarDoisNumeros();
    calc.subtratirDoisNumeros();
    calc.multiplicarDoisNumeros(55.5,5);
    System.out.println("Continuar exec");
  }
}
