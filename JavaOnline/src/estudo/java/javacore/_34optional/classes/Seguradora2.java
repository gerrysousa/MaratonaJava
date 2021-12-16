package estudo.java.javacore._34optional.classes;

import java.util.Optional;

public class Seguradora2 {

  private String nome;

  public Seguradora2(String nome) {
    this.nome = nome;
  }

  public Optional<String> getNome() {
    return Optional.ofNullable(nome);
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Seguradora2{" +
        "nome='" + nome + '\'' +
        '}';
  }
}
