package estudo.java.javacore._13interfaces.classes;

public class Produto implements Triutavel, Transportavel {

  private String nome;
  private double peso;
  private double preco;
  private double precoFinal;
  private double valorFrete;

  public Produto(String nome, double peso, double preco) {
    this.nome = nome;
    this.peso = peso;
    this.preco = preco;
  }

  @Override
  public void calculaImposto() {
    precoFinal = this.preco + (this.preco * IMPOSTO);
  }

  @Override
  public void calculaFrete() {
    this.valorFrete = this.preco / peso * 0.1;
  }

  @Override
  public String toString() {
    return "Produto{" +
        "nome='" + nome + '\'' +
        ", peso=" + peso +
        ", preco=" + preco +
        ", preco com imposto=" + precoFinal +
        ", valorFrete=" + valorFrete +
        '}';
  }
}
