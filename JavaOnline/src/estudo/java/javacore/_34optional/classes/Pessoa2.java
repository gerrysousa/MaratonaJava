package estudo.java.javacore._34optional.classes;

import java.util.Optional;

public class Pessoa2 {

  private String nome;
  private Carro2 carro2;
  private int idade;

  public Pessoa2(String nome) {
    this.nome = nome;
  }

  public Pessoa2(String nome, Carro2 carro2) {
    this.nome = nome;
    this.carro2 = carro2;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Optional<Carro2> getCarro2() {
    return Optional.ofNullable(carro2);
  }

  @Override
  public String toString() {
    return "Pessoa2{" +
        "nome='" + nome + '\'' +
        ", carro2=" + carro2 +
        ", idade=" + idade +
        '}';
  }

  public void setCarro2(Carro2 carro2) {
    this.carro2 = carro2;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
