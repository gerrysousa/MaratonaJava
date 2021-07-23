package estudo.java.javacore._22io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.crypto.spec.PSource;

public class FileTest {

  public static void main(String[] args) {
    File file = new File("arquivo.txt");

    try{
      System.out.println(file.createNewFile());
      System.out.println("Permissão de leitura? "+file.canRead());
      System.out.println("Path: "+file.getPath());
      System.out.println("Path completo: "+file.getAbsolutePath());
      System.out.println("É um diretório? "+file.isDirectory());
      System.out.println("Está oculto? "+file.isHidden());
      System.out.println("Last modified? "+new Date(file.lastModified()));
      System.out.println("Nome: "+file.getName());

      boolean exists = file.exists();
      if (exists){
        System.out.println("Deletado? "+file.delete());
      }
    }catch (IOException e){
      e.printStackTrace();
    }
  }
}
