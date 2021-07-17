package estudo.java.javacore._15exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

  public static void main(String[] args) {
    criarArquivo();
  }

  public static void criarArquivo(){
    File file = new File("test.txt");
    try {
      System.out.println("Arquivo criado? "+file.createNewFile());
      System.out.println("Depois de arquivo criado");
    }catch (IOException e){
      e.printStackTrace();
    }
  }
}
