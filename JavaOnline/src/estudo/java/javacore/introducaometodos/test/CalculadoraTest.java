package estudo.java.javacore.introducaometodos.test;

import estudo.java.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    calc.somarDoisNumeros();
    calc.subtratirDoisNumeros();
    calc.multiplicarDoisNumeros(55.5,5);
    double resultDiv = calc.divideDoisNumeros(20,2);
    System.out.println(resultDiv);
    int resultDiv2 = calc.divideDoisNumeros2(30,2);
    System.out.println(resultDiv2);
    calc.divideDoisNumeros3(30,0);
    System.out.println("Continuar exec");

    int[] numeros = {1,2,3,4,5};
    calc.somaArray(numeros);
    calc.somaVarArgs(numeros);
    calc.somaVarArgs(1,2,3,4,5);
    calc.somaVarArgsDoisOuMaisParams("mais",1,2,3,4,5);

  }
}
