package estudo.java.javacore._23nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPaths {

  public static void main(String[] args) {
    Path dir = Paths.get("pasta\\subpasta1");
    Path arquivo = Paths.get("subpasta2\\arquivo.txt");
    Path result = dir.resolve(arquivo);
    System.out.println(result);

    Path absoluto = Paths.get("C:\\workspace\\MaratonaJava\\JavaOnline");
    Path relativo = Paths.get("pasta");
    Path file = Paths.get("file.txt");

    System.out.println("_______________________________________");
    System.out.println("1: "+absoluto.resolve(relativo));
    System.out.println("2: "+absoluto.resolve(file));
    System.out.println("3: "+relativo.resolve(absoluto));
    System.out.println("4: "+relativo.resolve(file));
    System.out.println("5: "+file.resolve(absoluto));
    System.out.println("6: "+file.resolve(relativo));
  }
}
