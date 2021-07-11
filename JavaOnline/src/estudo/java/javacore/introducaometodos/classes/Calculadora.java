package estudo.java.javacore.introducaometodos.classes;

public class Calculadora {
  public void somarDoisNumeros(){
    System.out.println(5+5);
  }

  public void subtratirDoisNumeros(){
    System.out.println(5-5);
  }

  public void multiplicarDoisNumeros(double num1, int num2){
    System.out.println(num1*num2);
  }
  public double divideDoisNumeros(double num1, int num2){
    return num1/num2;
  }
  public int divideDoisNumeros2(double num1, int num2){
    return (int) (num1/num2);
  }
}
