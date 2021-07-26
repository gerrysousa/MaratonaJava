package estudo.java.javacore._23nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizarTest {
  public static void main(String[] args) {
    Path dir = Paths.get("pasta\\subpasta1");
    Path classe = Paths.get("pasta\\subpasta1\\subpasta2\\arquivo.txt");
    Path pathToClasse = dir.relativize(classe);
    System.out.println(pathToClasse);

    Path absoluto1 = Paths.get("\\workspace\\MaratonaJava\\JavaOnline");
    Path absoluto2 = Paths.get("\\users\\local");
    Path absoluto3 = Paths.get("\\workspace\\MaratonaJava\\JavaOnline\\pasta\\subpasta1\\subpasta2\\arquivo.txt");
    Path relativo1 = Paths.get("\\temp");
    Path relativo2 = Paths.get("\\temp\\tiao\\arquivo.txt");

    System.out.println("_______________________________________");
    System.out.println("1: "+absoluto1.relativize(absoluto3));
    System.out.println("2: "+absoluto3.relativize(absoluto1));
    System.out.println("3: "+absoluto1.relativize(absoluto2));
    System.out.println("4: "+relativo1.relativize(relativo2));
    System.out.println("5: "+absoluto1.relativize(relativo1));

  }
}
