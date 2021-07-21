package estudo.java.javacore._18strings.test;

public class StringPerformanceTest {

  public static void main(String[] args) {
    int tamanho = 100000;
    long inicio = System.currentTimeMillis();
    concatString(tamanho);
    long fim = System.currentTimeMillis();
    System.out.println("Tempo com String em ms: " + (fim - inicio));

    inicio = System.currentTimeMillis();
    concatStringBuffer(tamanho);
    fim = System.currentTimeMillis();
    System.out.println("Tempo com StringBuffer em ms: " + (fim - inicio));

    inicio = System.currentTimeMillis();
    concatStringBuilder(tamanho);
    fim = System.currentTimeMillis();
    System.out.println("Tempo com StringBuider em ms: " + (fim - inicio));
  }

  public static void concatString(int tam) {
    String string = "";
    for (int i = 0; i < tam; i++) {
      string += i;
    }
  }

  public static void concatStringBuilder(int tam) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < tam; i++) {
      sb.append(i);
    }
  }

  public static void concatStringBuffer(int tam) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < tam; i++) {
      sb.append(i);
    }
  }
}
