package estudo.java.javacore._6modificadorestatico.test;


import estudo.java.javacore._6modificadorestatico.classes.Cliente;

public class ClienteTest {

  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    Cliente c2 = new Cliente();
    Cliente c3 = new Cliente();
    System.out.println("Exibindo quantidade de parcelas possiveis: ");
    for(int parcela : cliente.getParcelas()){
      System.out.print(parcela+"; ");
    }
  }
}
