package estudo.java.javacore._37completablefuture.classes;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Loja {
  private String nome;

  public Loja(String nome) {
    this.nome = nome;
  }
  public Loja() {
  }
  public double getPreco() {
    return calcularPreco();
  }

  public Future<Double> getPrecoAsync() {
    CompletableFuture<Double> precoFuturo = new CompletableFuture<>();
    new Thread(() -> {
      precoFuturo.complete(calcularPreco());
    }).start();
    return precoFuturo;
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

  public Future<Double> getPrecoAsyncException() {
    CompletableFuture<Double> precoFuturo = new CompletableFuture<>();
    new Thread(() -> {
      try {
        precoFuturo.complete(calcularPrecoException());
      } catch (Exception e) {
        precoFuturo.completeExceptionally(e);
      }
    }).start();
    return precoFuturo;
  }

  public double calcularPrecoException() {
    delay();
    System.out.println(1 / 0);
    return ThreadLocalRandom.current().nextDouble() * 100;
  }

  public Future<Double> getPrecoAsyncExceptionTunado() {
    return CompletableFuture.supplyAsync(this::calcularPrecoException);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
