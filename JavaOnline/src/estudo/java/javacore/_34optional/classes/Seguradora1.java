package estudo.java.javacore._34optional.classes;

import java.util.Optional;

public class Seguradora1 {

  private String nome;

  public Seguradora1(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Seguradora1{" +
        "nome='" + nome + '\'' +
        '}';
  }
}
