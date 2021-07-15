package estudo.java.javacore._9sobrescrita.test;

import estudo.java.javacore._9sobrescrita.classes.Pessoa;

public class PessoaTest {

  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    p1.setNome("Pessoa nome");
    p1.setIdade(25);
    System.out.println(p1);

    Pessoa p2 = new Pessoa();
    p2.setNome("Bastiao");
    p2.setIdade(30);
    System.out.println(p2);
  }
}
