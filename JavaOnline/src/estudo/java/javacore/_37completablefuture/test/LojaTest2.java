package estudo.java.javacore._37completablefuture.test;

import static java.util.Arrays.asList;

import estudo.java.javacore._37completablefuture.classes.Loja;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class LojaTest2 {

  public static void main(String[] args) {
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
}
