package estudo.java.javacore._22io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

  public static void main(String[] args) {
    escreverEmArquivo2();
  }


  public static void escreverEmArquivo1() {
    File file = new File("arquivo.txt");
    try {
      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write("Primeira Linha");
      bw.newLine();//pulando linha
      bw.write("Segunda Linha");
      bw.flush();
      bw.close();

      System.out.println("---------");
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      String s = null;
      while ((s=br.readLine())!= null){
        System.out.println(s);
      }
      br.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void escreverEmArquivo2() {
    //Try with resources
    File file = new File("arquivo.txt");
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file)); BufferedReader br = new BufferedReader(new FileReader(file));){

      bw.write("Primeira Linha");
      bw.newLine();//pulando linha
      bw.write("Segunda Linha");
      bw.flush();
      System.out.println("---------");
      String s;
      while ((s=br.readLine())!= null){
        System.out.println(s);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
