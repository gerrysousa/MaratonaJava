package estudo.java.javacore._34optional.classes;

public class Pessoa1 {

  private String nome;
  private Carro1 carro1;


  public Pessoa1(String nome) {
    this.nome = nome;
  }

  public Pessoa1(String nome, Carro1 carro1) {
    this.nome = nome;
    this.carro1 = carro1;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Carro1 getCarro1() {
    return carro1;
  }

  @Override
  public String toString() {
    return "Pessoa1{" +
        "nome='" + nome + '\'' +
        ", carro1=" + carro1 +
        '}';
  }

  public void setCarro1(Carro1 carro1) {
    this.carro1 = carro1;
  }
}
