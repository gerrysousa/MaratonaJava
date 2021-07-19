package estudo.java.javacore._15exception.checkedexception.classes;

import estudo.java.javacore._15exception.customexceptions.LoginInvalidoException;
import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

  public void salvar() {
    System.out.println("Posso sobrescrever o metodo e não lançar as execeçoes do metodo sobrecrito");
    System.out.println("No casos do metodo pessoa.salvar() throws LoginInvalidoException , FileNotFoundException ");
  }

  public void logar() throws LoginInvalidoException  {
    System.out.println("Posso sobrescrever o metodo e lançar apenas uma execeçoes do metodo sobrecrito");
  }

  public void carregar() throws LoginInvalidoException  {
    System.out.println("Só posso lançar as exceptions que foram lançadas na classe PAI");
    System.out.println("Para esse metodo de funcionario eu não poderia lancar a execption IOException, pois não foi lancado em Pessoa");
  }

  public void ler() throws FileNotFoundException  {
    System.out.println("Posso sobrescrever o metodo e lançar uma execeçoes subclasse da exeception do metodo sobrecrito");
    System.out.println("No metodo pessoa.ler()  eu lancei  IOException, e aqui eu posso lancar FileNotFoundException, pois é subclasse de IOException");
  }



}
