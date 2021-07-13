package estudo.java.javacore.sobrecargametodos.test;

import estudo.java.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario();
    funcionario.init("Bastiao", "123.456.789-10", 4000);
    funcionario.imprimir();

    Funcionario funcionario2 = new Funcionario();
    funcionario2.init("Ze das couves", "123.123.123-12", 3500, "123123-5");
    funcionario2.imprimir();

    Funcionario funcionario3 = new Funcionario("Ze Pereira", "222.123.222-12", 4500, "222222-5");
    funcionario3.imprimir();
  }
}
