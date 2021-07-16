package estudo.java.javacore._14polimorfismo.test;

import estudo.java.javacore._14polimorfismo.classes.Gerente;
import estudo.java.javacore._14polimorfismo.classes.RelatorioPagamento;
import estudo.java.javacore._14polimorfismo.classes.Vendedor;

public class PolimorfismoTest {

  public static void main(String[] args) {
    Gerente g1 = new Gerente("Wayne", 5000, 2000);
    Vendedor v1= new Vendedor("Anna", 2000, 10000);
    RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
    //relatorioPagamento.relatorioPagamentoGerente(g1);
    System.out.println("------------------------");
    //relatorioPagamento.relatorioPagamentoVendedor(v1);

    System.out.println("---------- Generico abaixo --------------");
    relatorioPagamento.relatorioPagamentoGenerico(g1);
    System.out.println("------------------------");
    relatorioPagamento.relatorioPagamentoGenerico(v1);

  }
}
