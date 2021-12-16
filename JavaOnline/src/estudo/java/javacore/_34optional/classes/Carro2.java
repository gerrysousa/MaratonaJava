package estudo.java.javacore._34optional.classes;

import java.util.Optional;

public class Carro2 {

  private String nome;
  private Seguradora2 seguradora;

  public Carro2(String nome) {
    this.nome = nome;
  }

  public Carro2(String nome, Seguradora2 seguradora) {
    this.nome = nome;
    this.seguradora = seguradora;
  }

  public String getNomeSeguradora(Pessoa2 pessoa) {

    return "vazio";
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Optional<Seguradora2> getSeguradora() {
    return Optional.ofNullable(seguradora);
  }

  public void setSeguradora(Seguradora2 seguradora) {
    this.seguradora = seguradora;
  }

  @Override
  public String toString() {
    return "Carro2{" +
        "nome='" + nome + '\'' +
        ", seguradora=" + seguradora +
        '}';
  }
}
