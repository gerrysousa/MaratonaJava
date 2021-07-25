package estudo.java.javacore._23nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest {

  public static void main(String[] args) {
    //C:\workspace\MaratonaJava\JavaOnline\JavaOnline.iml
    Path p1 = Paths.get("C:\\workspace\\MaratonaJava\\JavaOnline\\JavaOnline.iml");
    Path p2 = Paths.get("C:\\workspace\\MaratonaJava\\JavaOnline","JavaOnline.iml");
    Path p3 = Paths.get("C:","workspace\\MaratonaJava\\JavaOnline","JavaOnline.iml");
    Path p4 = Paths.get("C:","workspace","MaratonaJava","JavaOnline","JavaOnline.iml");

  }
}
