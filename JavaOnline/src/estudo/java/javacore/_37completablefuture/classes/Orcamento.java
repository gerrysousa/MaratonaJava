package estudo.java.javacore._37completablefuture.classes;

import estudo.java.javacore._37completablefuture.classes.Desconto.Codigo;

public class Orcamento {

  private final String nomeDaLoja;
  private final double preço;
  private final Desconto.Codigo codigoDesconto;

  private Orcamento(String nomeDaLoja, double preço, Codigo codigoDesconto) {
    this.nomeDaLoja = nomeDaLoja;
    this.preço = preço;
    this.codigoDesconto = codigoDesconto;
  }

  public static Orcamento parse(String s) {
    String[] split = s.split(":");
    String nomeDaLoja = split[0];
    double preco = Double.parseDouble(split[1]);
    Desconto.Codigo codigoDesconto = Desconto.Codigo.valueOf(split[2]);

    return new Orcamento(nomeDaLoja, preco, codigoDesconto);
  }

  public String getNomeDaLoja() {
    return nomeDaLoja;
  }

  public double getPreço() {
    return preço;
  }

  public Codigo getCodigoDesconto() {
    return codigoDesconto;
  }
}
