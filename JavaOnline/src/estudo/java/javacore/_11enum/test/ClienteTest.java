package estudo.java.javacore._11enum.test;

import estudo.java.javacore._11enum.classes.Cliente;
import estudo.java.javacore._11enum.classes.Cliente.TipoPagamento;
import estudo.java.javacore._11enum.classes.TipoCliente;

public class ClienteTest {

  public static void main(String[] args) {
    Cliente c1 = new Cliente("Ciclano", TipoCliente.PESSOA_FISICA, TipoPagamento.APRAZO);
    System.out.println(c1);

    Cliente c2 = new Cliente("Tiao", TipoCliente.PESSOA_JURIDICA,TipoPagamento.AVISTA);
    System.out.println(c2);

    System.out.println(TipoCliente.PESSOA_FISICA.getId());
    System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
  }
}
