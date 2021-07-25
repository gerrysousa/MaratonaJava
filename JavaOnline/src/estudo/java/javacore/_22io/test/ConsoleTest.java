package estudo.java.javacore._22io.test;

import java.io.Console;

public class ConsoleTest {

  public static void main(String[] args) {
    /***
     Não funcionou no diretório do IntelliJ, copiar essa classe para outro diretório

     Abrir o terminal no diretório desse arquivo e compilar essa classe:
     $javac ConsoleTest.java

     Depois executar o proprama criado:
     $java ConsoleTest
     */

    Console c = System.console();
    char[] pw = c.readPassword("%s", "pw: ");
    for (char pass : pw){
      c.format("%c", pass);
    }
    c.format("\n");//quebra de linha no final do FOR

    //-----------------------------
    String texto;
    while (true){
      texto = c.readLine("%s","Digite: " );
      c.format("Esse texto < %s > foi digitado", retorno(texto));
      c.format("\n");//quebra de linha no final
    }
  }

  public static String retorno(String arg1){
    return arg1;
  }
}
