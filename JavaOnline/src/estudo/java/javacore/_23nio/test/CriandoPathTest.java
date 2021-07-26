package estudo.java.javacore._23nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {

  public static void main(String[] args) {
    //C:\workspace\MaratonaJava\JavaOnline\JavaOnline.iml
    Path p1 = Paths.get("C:\\workspace\\MaratonaJava\\JavaOnline\\arquivo.txt");
    Path p2 = Paths.get("C:\\workspace\\MaratonaJava\\JavaOnline","arquivo.txt");
    Path p3 = Paths.get("C:","workspace\\MaratonaJava\\JavaOnline","arquivo.txt");
    Path p4 = Paths.get("C:","workspace","MaratonaJava","JavaOnline","arquivo.txt");

    System.out.println(p4.toAbsolutePath());
    File file = p4.toFile();
    Path path = file.toPath();

    Path path1 = Paths.get("pasta");
    Path path2 = Paths.get("pasta\\subpasta1\\subpasta2\\doc.txt");
    Path path3 = Paths.get("pasta\\subpasta1\\subpasta2\\doc.txt");
    try {
      if (Files.notExists(path1)) {
        Files.createDirectory(path1);
      }
      if (Files.notExists(path2)) {
        Files.createDirectories(path2);
      }
      if (Files.notExists(path3.getParent())) {//.getParent() faz o java criar apenas os diretórios e não o arquivo final
        Files.createDirectories(path3.getParent());
      }
    }catch (IOException e){
      e.printStackTrace();
    }

    Path source = Paths.get("pasta\\subpasta1\\subpasta2\\doc.txt");
    Path target = Paths.get("pasta\\subpasta1\\docCopiado.txt");

    try {
      Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
      Files.deleteIfExists(target);
    }catch (IOException e){
      e.printStackTrace();
    }

  }
}
