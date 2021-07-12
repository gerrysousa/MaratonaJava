package estudo.java.javacore.introducaometodos.classes;

public class Calculadora {

  public void somarDoisNumeros() {
    System.out.println(5 + 5);
  }

  public void subtratirDoisNumeros() {
    System.out.println(5 - 5);
  }

  public void multiplicarDoisNumeros(double num1, int num2) {
    System.out.println(num1 * num2);
  }

  public double divideDoisNumeros(double num1, int num2) {
    if (num2 != 0) {
      return num1 / num2;
    }
    return 0;
  }

  public int divideDoisNumeros2(double num1, int num2) {
    if (num2 != 0) {
      return (int) (num1 / num2);
    }
    return 0;
  }

  public void divideDoisNumeros3(double num1, int num2) {
    if (num2 != 0) {
      System.out.println(num1 / num2);
      return;// esse return funciona como um break de uma estrutura de repeticao, e só funciona pra metodos void
    }
    System.out.println("Nao eh possivel dividir por 0");
  }
  public void alteraDoisNumeros(double num1, double num2) {
    num1 = 30;
    num2 = 40;
    System.out.println("Dentro do metodo");
    System.out.println("num1: "+num1);
    System.out.println("num2: "+num2);
  }

}
