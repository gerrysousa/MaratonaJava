package estudo.java.javacore._37completablefuture.test;

import estudo.java.javacore._37completablefuture.classes.Loja;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class LojaTest {

  public static void main(String[] args) {
    Loja americanas = new Loja();
    Loja submarino = new Loja();
    Loja fastShop = new Loja();
    Loja Magalu = new Loja();

    long start = System.currentTimeMillis();
    System.out.println("Preço americanas: " + americanas.getPreco());
    System.out.println("Preço submarino: " + submarino.getPreco());
    System.out.println("Preço fastShop: " + fastShop.getPreco());
    System.out.println("Preço Magalu: " + Magalu.getPreco());
    System.out.println("Tempo total getPreco sincrono: " + (System.currentTimeMillis() - start) + " ms");

    long start2 = System.currentTimeMillis();
    Future<Double> precoAsync1 = americanas.getPrecoAsync();
    Future<Double> precoAsync2 = submarino.getPrecoAsync();
    Future<Double> precoAsync3 = fastShop.getPrecoAsync();
    Future<Double> precoAsync4 = Magalu.getPrecoAsync();
    System.out.println("Tempo invocação assincrono: " + (System.currentTimeMillis() - start2) + " ms");
    enrolando();
    try {
      System.out.println("Preço americanas: " + precoAsync1.get());
      System.out.println("Preço submarino: " + precoAsync2.get());
      System.out.println("Preço fastShop: " + precoAsync3.get());
      System.out.println("Preço Magalu: " + precoAsync4.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
    System.out.println("Tempo total getPreco assincrono: " + (System.currentTimeMillis() - start2) + " ms");

    System.out.println("================================");
    Loja lojaAsyncException1 = new Loja();
    Loja lojaAsyncException2 = new Loja();
    Loja lojaAsyncException3 = new Loja();

    Future<Double> precoAsyncExce1 = lojaAsyncException1.getPrecoAsyncException();
    Future<Double> precoAsyncExce2 = lojaAsyncException2.getPrecoAsyncException();
    Future<Double> precoAsyncExce3 = lojaAsyncException2.getPrecoAsyncExceptionTunado();

    try {
      System.out.println("Preço exception1 tradando com Timeout por parametro no metodo get: " + precoAsyncExce1.get(3, TimeUnit.SECONDS));
      System.out.println("Preço exception2: " + precoAsyncExce2.get());
      System.out.println("Preço exception3: " + precoAsyncExce3.get());
    } catch (InterruptedException | TimeoutException | ExecutionException e) {
      e.printStackTrace();
    }
  }

  public static void enrolando() {
    long soma = 0;
    for (int i = 0; i < 1_000_000; i++) {
      soma += i;
    }
    System.out.println("Enrolando. Soma=" + soma);
  }
}
