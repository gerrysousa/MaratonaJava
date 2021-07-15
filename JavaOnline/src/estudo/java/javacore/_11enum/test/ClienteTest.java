package estudo.java.javacore._11enum.test;

import estudo.java.javacore._11enum.classes.Cliente;
import estudo.java.javacore._11enum.classes.TipoCliente;

public class ClienteTest {

  public static void main(String[] args) {
    Cliente c1 = new Cliente("Ciclano", TipoCliente.PESSOA_FISICA);
    System.out.println(c1);

    Cliente c2 = new Cliente("Tiao", TipoCliente.PESSOA_JURIDICA);
    System.out.println(c2);
  }
}
