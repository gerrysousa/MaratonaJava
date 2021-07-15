package estudo.java.javacore._8heranca.classes;

public class Funcionario  extends Pessoa{
 private double salario;

  static {
    System.out.println("Bloco de inicialização funcionario estatico");
  }
  {
    System.out.println("Bloco de inicialização funcionario comum 1");
  }
  {
    System.out.println("Bloco de inicialização funcionario comum 2");
  }
  public Funcionario(String nome) {
    super(nome);
    System.out.println("Construtor Funcionario");
  }

  public Funcionario(String nome, String cpf) {
    super(nome,cpf);
  }

  public Funcionario(String nome, String cpf, double salario) {
    this(nome,cpf);
    this.salario = salario;
  }

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
