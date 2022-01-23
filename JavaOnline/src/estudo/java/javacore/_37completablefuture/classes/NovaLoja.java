package estudo.java.javacore._37completablefuture.classes;

import static java.util.Arrays.asList;

import estudo.java.javacore._37completablefuture.classes.Desconto.Codigo;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class NovaLoja {

  private String nome;

  public NovaLoja(String nome) {
    this.nome = nome;
  }

  public NovaLoja() {
  }

  public String getPreco() {
    //NomeDaLoja:Preco:CodigoDescont
    Locale.setDefault(Locale.US);
    double preco = calcularPreco();
    Desconto.Codigo codigo = Desconto.Codigo.values()[ThreadLocalRandom.current().nextInt(Codigo.values().length)];

    return String.format("%s:%.2f:%s",nome, preco, codigo);
  }

  public double calcularPreco() {
    delay();
    return ThreadLocalRandom.current().nextDouble() * 100;
  }

  public static void delay() {
    try {
      TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public String getNome() {
    return nome;
  }

  public static List<NovaLoja> lojas(){
    return asList(
        new NovaLoja("Loja 01X"),
        new NovaLoja("Loja 02X"),
        new NovaLoja("Loja 03X"),
        new NovaLoja("Loja 04X")
    );
  }
}
