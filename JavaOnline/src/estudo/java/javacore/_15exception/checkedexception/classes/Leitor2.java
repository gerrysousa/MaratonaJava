package estudo.java.javacore._15exception.checkedexception.classes;

import java.io.Closeable;

public class Leitor2 implements AutoCloseable {

  @Override
  public void close() throws Exception {
    System.out.println("Fechando Leitor 2");
  }
}
