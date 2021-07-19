package estudo.java.javacore._15exception.checkedexception.test;

import estudo.java.javacore._15exception.checkedexception.classes.Funcionario;
import estudo.java.javacore._15exception.checkedexception.classes.Pessoa;

public class SobrescritaComExceptionTest {

  public static void main(String[] args) {
    Funcionario f1 = new Funcionario();
    Pessoa p1 = new Pessoa();
    f1.salvar();
    System.out.println("se eu chamar o metodo p1.salvar(), será necessario um bloco try-catch aqui no metodo main, pois a o metodo pessoa.salvar() pode lançar exception");
    //p1.salvar();
  }
}
