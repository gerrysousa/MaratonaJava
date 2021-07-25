package estudo.java.javacore._22io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReaderTest {

  public static void main(String[] args) {
    escreverELerEmArquivo2();
  }

  public static void escreverEmArquivo1() {
    // Ao inicializar o FileWriter(file) vc pode passar o parametro true ,
    // Aí será feito o append no arquivo, e vai add novas linhas ao invés de sobrescrever as linhas no arquivo
    File file = new File("arquivo.txt");

    try {
      FileWriter fw = new FileWriter(file);
      fw.write("Esta linha vai ser sobrescrita");
      fw.flush();
      fw.close();

      FileWriter fw2 = new FileWriter(file);
      fw2.write("Escrevendo no arquivo. \n E pulando uma linha \n");
      fw2.flush();
      fw2.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void escreverEmArquivo2() {
    File file = new File("arquivo2.txt");

    try {
      FileWriter fw = new FileWriter(file, true);// Parametro true, para faze o append no arquivo
      fw.write("Esta linha vai permanecer no arquivo\n");
      fw.flush();
      fw.close();

      FileWriter fw2 = new FileWriter(file, true);// Parametro true, para faze o append no arquivo
      fw2.write("Escrevendo no arquivo. \nE pulando uma linha \n");
      fw2.flush();
      fw2.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void escreverELerEmArquivo1() {
    File file = new File("arquivo3.txt");

    try {
      FileWriter fw = new FileWriter(file);// Parametro true, para faze o append no arquivo
      fw.write("Esta linha vai permanecer no arquivo\n");
      fw.flush();
      fw.close();

      FileReader fr = new FileReader(file);
      char[] in = new char[500];
      int size = fr.read(in);
      System.out.println("Tamanho: " + size);
      for (char c : in) {
        System.out.print(c);
      }
      fr.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void escreverELerEmArquivo2() {
    //Try wiht resources
    File file = new File("arquivo4.txt");

    try (FileWriter fw = new FileWriter(file); FileReader fr = new FileReader(file)) {
      fw.write("Esta linha vai permanecer no arquivo\n");
      fw.flush();

      char[] in = new char[500];
      int size = fr.read(in);
      System.out.println("Tamanho: " + size);
      for (char c : in) {
        System.out.print(c);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
