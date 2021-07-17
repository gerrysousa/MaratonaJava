package estudo.java.javacore._15exception.checkedexception.test;

import estudo.java.javacore._15exception.checkedexception.classes.Leitor1;
import estudo.java.javacore._15exception.checkedexception.classes.Leitor2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest {

  public static void main(String[] args) {
    System.out.println("Resources do Try, devem implementar Closeable");
    fechandoArquivos();
  }

  public static void fechandoArquivos() {
    System.out.println("A ordem de fechamento é sempre do ultimo para o primeiro");
    try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {
    } catch (Exception e) {

    }
  }

  public static void lerArquivo() {
    System.out.println("Java 7, não é obrigatorio ter o catch, mas é uma boa pratica colocar,");
    try (Reader reader = new BufferedReader(new FileReader("text.txt"))) {
    } catch (IOException e) {

    }
  }

  public static void lerArquivo2() throws IOException {
    System.out.println("Java 7, não é obrigatorio ter o catch, mas o erro vai ser lancado pra classe que chamou o metodo");
    try (Reader reader = new BufferedReader(new FileReader("text.txt"))) {
    }
  }

  public static void lerArquivoOld() {
    Reader reader = null;
    try {
      reader = new BufferedReader(new FileReader("text.txt"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
