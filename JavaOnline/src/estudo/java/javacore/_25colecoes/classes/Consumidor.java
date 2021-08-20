package estudo.java.javacore._25colecoes.classes;

import java.util.Objects;

public class Consumidor {

  private String cpf;
  private String nome;

  public Consumidor(String cpf, String nome) {
    this.cpf = cpf;
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Consumidor{" +
        "cpf='" + cpf + '\'' +
        ", nome='" + nome + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consumidor that = (Consumidor) o;
    return cpf.equals(that.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf);
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
