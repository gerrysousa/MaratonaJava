package estudo.java.javacore._5blocodeinicializacao.test;

import estudo.java.javacore._5blocodeinicializacao.classes.Cliente;

public class ClienteTest {

  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    System.out.println("Exibindo quantidade de parcelas possiveis: ");
    for(int parcela : cliente.getParcelas()){
      System.out.print(parcela+"; ");
    }
  }
}
