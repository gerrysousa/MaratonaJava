package estudo.java.javacore._34optional.classes;

public class Carro1 {

  private String nome;
  private Seguradora1 seguradora;

  public Carro1(String nome) {
    this.nome = nome;
  }

  public Carro1(String nome, Seguradora1 seguradora) {
    this.nome = nome;
    this.seguradora = seguradora;
  }

  public String getNomeSeguradora(Pessoa1 pessoa) {
    if (pessoa != null) {
      Carro1 carro = pessoa.getCarro1();
      if (carro != null) {
        Seguradora1 seguradora = carro.getSeguradora();
        if (seguradora != null) {
          return seguradora.getNome();
        }
      }
    }
    return "vazio";
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Seguradora1 getSeguradora() {
    return seguradora;
  }

  public void setSeguradora(Seguradora1 seguradora) {
    this.seguradora = seguradora;
  }

  @Override
  public String toString() {
    return "Carro1{" +
        "nome='" + nome + '\'' +
        ", seguradora=" + seguradora +
        '}';
  }
}
