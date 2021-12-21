package estudo.java.javacore._35streams.classes;


import static java.util.Arrays.asList;

import java.util.List;

public class Pessoa {

  private String nome;
  private int idade;
  private double salario;

  public Pessoa(String nome, int idade, double salario) {
    this.nome = nome;
    this.idade = idade;
    this.salario = salario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
        "nome='" + nome + '\'' +
        ", idade=" + idade +
        ", salario=" + salario +
        '}';
  }

  public static List<Pessoa> bancoDePessoas(){
    return asList(
        new Pessoa("Bastiao", 22, 2000),
        new Pessoa("Tiao", 19, 2500),
        new Pessoa("Ze das couves", 26, 1900),
        new Pessoa("Ze das galinas", 20, 1500),
        new Pessoa("Fulano", 24, 7000),
        new Pessoa("Cicrano", 35, 6000),
        new Pessoa("Deotrano", 40, 2300),
        new Pessoa("Xico", 29, 10000),
        new Pessoa("Tome", 27, 4400),
        new Pessoa("Cabral", 21, 5000)
    );
  }
}
