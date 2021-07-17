package estudo.java.javacore._15exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

  public static void main(String[] args) {
    criarArquivo();
  }

  public static void criarArquivo() {
    System.out.println("O metodo que chamar esse, não vai receber uma exception para tratar");
    File file = new File("test.txt");
    try {
      System.out.println("Arquivo criado? " + file.createNewFile());
      System.out.println("Depois de arquivo criado");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void criarArquivoTrataExceptionNoMetodo() throws IOException {
    System.out.println("O metodo que chamar esse, pode receber uma exception para tratar");
    File file = new File("test.txt");
    try {
      System.out.println("Arquivo criado? " + file.createNewFile());
      System.out.println("Depois de arquivo criado");
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Fez algum tratamento, mas mesmo assim lança uma exception para o metodo que chamou");
      throw e;
    }
  }

  public static void criarArquivoLancaExceptionParaOMetodoQueChamou() throws IOException {
    System.out.println("O metodo que chamar esse, pode receber uma exception para tratar");
    File file = new File("test.txt");
    System.out.println("Arquivo criado? " + file.createNewFile());
  }

}
