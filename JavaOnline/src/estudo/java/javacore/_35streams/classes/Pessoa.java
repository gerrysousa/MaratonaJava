package estudo.java.javacore._35streams.classes;


import static java.util.Arrays.asList;

import java.util.List;
import java.util.Objects;

public class Pessoa {

  private String nome;
  private int idade;
  private double salario;
  private Genero genero;

  public Pessoa(String nome, int idade, double salario) {
    this.nome = nome;
    this.idade = idade;
    this.salario = salario;
  }

  public Pessoa(String nome, int idade, double salario, Genero genero) {
    this.nome = nome;
    this.idade = idade;
    this.salario = salario;
    this.genero = genero;
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
        '}';
  }

  public static List<Pessoa> bancoDePessoas(){
    return asList(
        new Pessoa("Bastiao", 22, 2000, Genero.MASCULINO),
        new Pessoa("Tiao", 16, 2500, Genero.MASCULINO),
        new Pessoa("Ze das couves", 26, 1900, Genero.MASCULINO),
        new Pessoa("Ze das galinas", 20, 1500, Genero.MASCULINO),
        new Pessoa("Clementina", 24, 7000, Genero.FEMININO),
        new Pessoa("Eurica", 35, 6000, Genero.FEMININO),
        new Pessoa("Tiana", 40, 2300, Genero.FEMININO),
        new Pessoa("Xico", 29, 10000, Genero.MASCULINO),
        new Pessoa("Tome", 27, 4400, Genero.MASCULINO),
        new Pessoa("Cabralia", 17, 5000, Genero.FEMININO),
        new Pessoa("Cabralia", 21, 5000, Genero.FEMININO)
    );
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pessoa pessoa = (Pessoa) o;
    return Objects.equals(nome, pessoa.nome);
  }

  public Genero getGenero() {
    return genero;
  }

  public void setGenero(Genero genero) {
    this.genero = genero;
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome);
  }
}
