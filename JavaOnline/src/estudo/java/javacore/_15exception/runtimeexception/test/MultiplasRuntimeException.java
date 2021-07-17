package estudo.java.javacore._15exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntimeException {

  public static void main(String[] args) {
    try {
      System.out.println("Sempre colocar o catch mais generico por ultimo");
      //throw new IndexOutOfBoundsException();
      //throw new ArrayIndexOutOfBoundsException();
      //throw new IllegalArgumentException();
      //throw new ArithmeticException();
      throw new RuntimeException();
    }catch (ArrayIndexOutOfBoundsException e){
      System.out.println("1 - Dentro do catch ArrayIndexOutOfBoundsException");
    }catch (IndexOutOfBoundsException e){
      System.out.println("2 - Dentro do catch IndexOutOfBoundsException");
    }catch (IllegalArgumentException e){
      System.out.println("3 - Dentro do catch IllegalArgumentException");
    }catch (ArithmeticException e){
      System.out.println("4 - Dentro do catch ArithmeticException");
    }catch (RuntimeException e){
      System.out.println("5 - Dentro do catch RuntimeException");
    }

    System.out.println("Fim do programa");
    System.out.println("-------------------------------------------");
    try {
      talvezLanceException();
    }catch (SQLException e){
      System.out.println("Executa se a exception foi do SQL");
    }catch (FileNotFoundException e){
      System.out.println("Executa se a exception foi de arquivo");
    }
    System.out.println("--------------Colocando as duas exceptions-----------------------------");
    try {
      talvezLanceExceptionJava7();
    }catch (SQLException | FileNotFoundException e){
      System.out.println("Executa para qualquer exception");
    }
    System.out.println("------------------ colocando uma exception generica apenas -------------------------");
    try {
      talvezLanceExceptionJava7();
    }catch (Exception e){
      System.out.println("Executa para qualquer exception");
    }

  }
  private static void talvezLanceException() throws SQLException, FileNotFoundException{
    System.out.println("Dentro da classe talvezLanceException");
  }

  private static void talvezLanceExceptionJava7() throws SQLException, FileNotFoundException{
    System.out.println("Dentro da classe talvezLanceExceptionJava7");
  }
}
