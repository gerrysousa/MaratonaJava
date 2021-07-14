package estudo.java.javacore._8heranca.test;

import estudo.java.javacore._8heranca.classes.Endereco;
import estudo.java.javacore._8heranca.classes.Funcionario;
import estudo.java.javacore._8heranca.classes.Pessoa;

public class HerancaTest {

  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Endereco end1 = new Endereco();


    end1.setRua("Rua x");
    end1.setBairro("Bairro x");

    p1.setNome("Fulano");
    p1.setCpf("12345678910");
    p1.setEndereco(end1);
    p1.print();
    System.out.println("----------------------");
    Funcionario func1 = new Funcionario();
    func1.setNome("Cicrano funcionario");
    func1.setCpf("9876543621");
    func1.setEndereco(end1);
    func1.setSalario(4000);
    func1.print();


  }
}
