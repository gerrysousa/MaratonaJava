package estudo.java.javacore._14polimorfismo.classes;

public class Gerente extends Funcionario {
  private double pl;

  public Gerente(String nome, double salario, double pl) {
    super(nome, salario);
    this.pl = pl;
  }

  @Override
  public void calcularPagamentos() {
    this.salario = this.salario + pl;
  }

  public double getPl() {
    return pl;
  }

  public void setPl(double pl) {
    this.pl = pl;
  }
}
