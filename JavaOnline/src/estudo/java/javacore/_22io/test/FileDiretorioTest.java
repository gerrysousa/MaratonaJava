package estudo.java.javacore._22io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDiretorioTest {

  public static void main(String[] args) {
    buscarArquivos();
  }

  public static void criarDiretorio1() {
    File diretorio = new File("folder01");
    try {
      boolean criado = diretorio.mkdir();
      System.out.println("Foi criado agora? " + criado);
      System.out.println("Permissão de leitura? " + diretorio.canRead());
      System.out.println("Path: " + diretorio.getPath());
      System.out.println("Path completo: " + diretorio.getAbsolutePath());
      System.out.println("É um diretório? " + diretorio.isDirectory());
      System.out.println("Está oculto? " + diretorio.isHidden());
      System.out.println("Last modified? " + new Date(diretorio.lastModified()));
      System.out.println("Nome: " + diretorio.getName());

      File file2 = new File("C:\\workspace\\MaratonaJava\\JavaOnline\\folder01\\arquivo2.txt");
      File file = new File(diretorio, "arquivo.txt");

      System.out.println(file2.createNewFile());
      System.out.println(file.createNewFile());

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void renomearDiretorio1() {
    File diretorio = new File("folder01");
    try {
      boolean criado = diretorio.mkdir();
      File diretorioRenomeado = new File("folderRenomeado");
      diretorio.renameTo(diretorioRenomeado);
      System.out.println("Foi criado agora? " + criado);
      System.out.println("Permissão de leitura? " + diretorio.canRead());
      System.out.println("Path: " + diretorio.getPath());
      System.out.println("Path completo: " + diretorio.getAbsolutePath());
      System.out.println("É um diretório? " + diretorio.isDirectory());
      System.out.println("Está oculto? " + diretorio.isHidden());
      System.out.println("Last modified? " + new Date(diretorio.lastModified()));
      System.out.println("Nome: " + diretorio.getName());

      File file = new File(diretorioRenomeado, "arquivo.txt");
      File file2 = new File(diretorioRenomeado, "renomeado.txt");

      System.out.println(file.createNewFile());
      file.renameTo(file2);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void buscarArquivos() {
    File diretorio = new File("folderBusca");
    try {
      boolean criado = diretorio.mkdir();
      File file = new File(diretorio, "arquivo.txt");
      File file2 = new File(diretorio, "renomeado.txt");
      System.out.println(file.createNewFile());
      System.out.println(file2.createNewFile());

      String[] list = diretorio.list();
      for (String item : list) {
        System.out.println(item);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
