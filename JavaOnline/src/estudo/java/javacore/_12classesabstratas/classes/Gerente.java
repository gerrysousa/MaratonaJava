package estudo.java.javacore._12classesabstratas.classes;

public class Gerente extends Funcionario{

  public Gerente() {
  }

  public Gerente(String nome, String clt, double salario) {
    super(nome, clt, salario);
  }

  @Override
  public void calculaSalario(){
    this.salario = salario + (salario *0.2);
  }
  @Override
  public void metodoAbstrat02(){
    System.out.println("A primeira classe descendente concreta é preciso implementar os metodos abstratos ainda não implementados ");
  }

}
