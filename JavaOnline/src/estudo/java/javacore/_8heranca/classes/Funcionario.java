package estudo.java.javacore._8heranca.classes;

public class Funcionario  extends Pessoa{
 private double salario;


  public void print() {
    super.print();
    System.out.println("Salario: "+this.salario);
    imprimeReciboPagamento();
  }

  public void imprimeReciboPagamento() {
    System.out.println("Eu "+super.nome+" recebi o pagamento de R$"+  this.salario);
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
