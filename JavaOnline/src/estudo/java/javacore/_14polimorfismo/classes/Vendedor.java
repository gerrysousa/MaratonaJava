package estudo.java.javacore._14polimorfismo.classes;

public class Vendedor extends Funcionario {
  private double totalVendas;

  public Vendedor(String nome, double salario, double totalVendas) {
    super(nome, salario);
    this.totalVendas = totalVendas;
  }

  @Override
  public void calcularPagamentos() {
    this.salario = this.salario + (totalVendas*0.05);
  }
}
