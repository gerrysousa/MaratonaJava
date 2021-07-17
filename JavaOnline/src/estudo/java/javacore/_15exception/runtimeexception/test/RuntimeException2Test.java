package estudo.java.javacore._15exception.runtimeexception.test;

public class RuntimeException2Test {
  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    try {
      divisao(a, b);
    }catch (RuntimeException e){
      System.out.println(e.getMessage());
      e.printStackTrace();
    }

  }

  public static void divisao(int num1, int num2){

    if (num2==0){
      throw new IllegalArgumentException("O parametro num2 não pode ser zero");
    }

    int result = num1/num2;
    System.out.println(result);
  }
}
