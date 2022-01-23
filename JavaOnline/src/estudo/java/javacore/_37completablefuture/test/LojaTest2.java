package estudo.java.javacore._37completablefuture.test;

import static java.util.Arrays.asList;

import estudo.java.javacore._37completablefuture.classes.Loja;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class LojaTest2 {

  public static void main(String[] args) {
    /***
     NumeroDeThread = Ncpu * Ucpu * (1+W/C)
     Ncpu = numero de cores disponiveis
     Ucpu = a utilização da CPU (vai de 0 a 1) exemplo: 1 = 100% de utilização da CPU, 0.4 = 40% de utilização da CPU
     W/C = wait time e compute time

     Exemplo:
     NThreads = 8 * 1 * (1+99) = 800 threads (para colocar o computador em 100% de utilização precisaria de 800 threads rodando)


     Quando usar multiplas threads:
     --------
     Vc deve usar STREAM: quando vc tem uma computação pesada de operações
     SEM estar esperando dados de network ou de entrada e saida (ex.: leitura de dados do disco),
     porque as threads criadas são non-block,
     --------
     Vc deve usar CompletableFuture:
     Se vc tiver trabalhando com alguma coisa que vc TEM tempo de espera,
     como entrada e saida (ex.: leitura de dados do disco) e network, o CompletableFuture com executor é uma boa saida.
     --------

     se quiser ver a diferenca de processamento do Stream vs CompletableFuture
     acrescentar varias lojas na lista abaixo: "new Loja("Loja 04")"

     */
    System.out.println("Ncpu: " + Runtime.getRuntime().availableProcessors());

    List<Loja> lojas = asList(
        new Loja("Loja 01"),
        new Loja("Loja 02"),
        new Loja("Loja 03"),
        new Loja("Loja 04")
    );

    acharPrecos(lojas);
    acharPrecos2(lojas);
    acharPrecos3(lojas);
    acharPrecos4(lojas);

    final Executor executor = Executors.newFixedThreadPool(Math.min(lojas.size(), 50),
        r -> {
          Thread t = new Thread(r);
          t.setDaemon(true);
          return t;
        });
    acharPrecos5(lojas, executor);
  }

  public static List<String> acharPrecos(List<Loja> lojas) {
    System.out.println("Stream sequencial");
    long start = System.currentTimeMillis();
    List<String> collect = lojas.stream()
        .map(loja -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco()))
        .collect(Collectors.toList());
    System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
    System.out.println(collect);
    return collect;
  }

  public static List<String> acharPrecos2(List<Loja> lojas) {
    System.out.println("Stream parallelos");
    long start = System.currentTimeMillis();
    List<String> collect = lojas.parallelStream()
        .map(loja -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco()))
        .collect(Collectors.toList());
    System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
    System.out.println(collect);
    return collect;
  }

  public static List<String> acharPrecos3(List<Loja> lojas) {
    System.out.println("Completable future sequencial");
    long start = System.currentTimeMillis();

    List<String> collect = lojas.stream()
        .map(loja -> CompletableFuture.supplyAsync(
            () -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco())
        )).map(CompletableFuture::join)
        .collect(Collectors.toList());
    System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
    System.out.println(collect);
    return collect;
  }

  public static List<String> acharPrecos4(List<Loja> lojas) {
    System.out.println("Completable future paralelo");
    long start = System.currentTimeMillis();

    List<CompletableFuture<String>> precoFuturo = lojas.stream()
        .map(loja -> CompletableFuture.supplyAsync(
            () -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco())
        ))
        .collect(Collectors.toList());
    System.out.println("Tempo de invocação : " + (System.currentTimeMillis() - start) + " ms");

    List<String> collect = precoFuturo.stream().map(CompletableFuture::join).collect(Collectors.toList());

    System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
    System.out.println(collect);
    return collect;
  }

  public static List<String> acharPrecos5(List<Loja> lojas, Executor executor) {
    System.out.println("Completable future paralelo com executor especial");
    long start = System.currentTimeMillis();

    List<CompletableFuture<String>> precoFuturo = lojas.stream()
        .map(loja -> CompletableFuture.supplyAsync(
            () -> String.format("%s o preco eh: %.2f", loja.getNome(), loja.getPreco()), executor
        ))
        .collect(Collectors.toList());
    System.out.println("Tempo de invocação : " + (System.currentTimeMillis() - start) + " ms");

    List<String> collect = precoFuturo.stream().map(CompletableFuture::join).collect(Collectors.toList());

    System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
    System.out.println(collect);
    return collect;
  }
}
