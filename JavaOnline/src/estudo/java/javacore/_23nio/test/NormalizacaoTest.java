package estudo.java.javacore._23nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTest {

  public static void main(String[] args) {
    /***
     Normalizar é retirar os  \..\..\  ou \.\  do path

     Exemplos:
     Sem normalizar: JavaOnline\pasta\subpasta1\subpasta2\..\..\arquivo.txt
     Normalizado: JavaOnline\pasta\arquivo.txt
     Sem normalizar: JavaOnline\.\pasta\.\subpasta1\.\subpasta2
     Normalizado: JavaOnline\pasta\subpasta1\subpasta2
     */
    
    String diretorioProj = "JavaOnline\\pasta\\subpasta1\\subpasta2";
    String arquivo = "..\\..\\arquivo.txt";

    Path p1 = Paths.get(diretorioProj, arquivo);
    System.out.println("Sem normalizar: "+p1);
    System.out.println("Normalizado: "+p1.normalize());

    Path p2 = Paths.get("JavaOnline/./pasta/./subpasta1/./subpasta2");
    System.out.println("Sem normalizar: "+p2);
    System.out.println("Normalizado: "+p2.normalize());

  }
}