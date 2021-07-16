package estudo.java.javacore._12classesabstratas.classes;

public class Vendedor extends Funcionario{
  private double totalVendas;

  public Vendedor() {
  }

  public Vendedor(String nome, String clt, double salario, double totalVendas) {
    super(nome, clt, salario);
    this.totalVendas = totalVendas;
  }

  @Override
  public void calculaSalario() {
    this.salario = salario + (totalVendas *0.05);
  }

  @Override
  public void metodoAbstrat02(){
    System.out.println("A primeira classe descendente concreta é preciso implementar os metodos abstratos ainda não implementados ");
  }

  public double getTotalVendas() {
    return totalVendas;
  }

  public void setTotalVendas(double totalVendas) {
    this.totalVendas = totalVendas;
  }
}
