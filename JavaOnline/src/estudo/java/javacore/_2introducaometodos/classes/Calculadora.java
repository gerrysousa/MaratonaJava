package estudo.java.javacore._2introducaometodos.classes;

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
    // quando é tipo primitivo, o metodo recebe uma copia do valor,
    // quando é tipo reference, o metodo recebe a referencia do objeto na memoria
    num1 = 30;
    num2 = 40;
    System.out.println("Dentro do metodo");
    System.out.println("num1: "+num1);
    System.out.println("num2: "+num2);
  }

  public void somaArray(int[] numeros) {
    int soma = 0;
    for (int num : numeros){
      soma += num;
    }
    System.out.println("A soma é: "+soma);
  }

  public void somaVarArgs(int... numeros) {
    int soma = 0;
    for (int num : numeros){
      soma += num;
    }
    System.out.println("A soma é: "+soma);
  }
  public void somaVarArgsDoisOuMaisParams(String param1, int... numeros) {
    int soma = 0;
    for (int num : numeros){
      soma += num;
    }
    System.out.println("Metodo que recebe mais parametros, o VarArgs deve vir por ultimo : "+param1);
    System.out.println("A soma é: "+soma);
  }
}
