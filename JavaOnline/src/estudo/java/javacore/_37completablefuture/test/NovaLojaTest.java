package estudo.java.javacore._37completablefuture.test;

import estudo.java.javacore._37completablefuture.classes.Desconto;
import estudo.java.javacore._37completablefuture.classes.Loja;
import estudo.java.javacore._37completablefuture.classes.NovaLoja;
import estudo.java.javacore._37completablefuture.classes.Orcamento;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NovaLojaTest {

  public static void main(String[] args) {
    /***
     CompletableFuture.allOf = espera todos os completablesFuture serem respondidos
     CompletableFuture.anyOf = espera pelo primeiro completablesFuture ser respondido e ignora os outros
     Exemplo bom para o anyOf é obter a cotação do dolar, vc pode mandar a requisicao para varias lojas, a primeira que responder já ignora o resto.
     *
     */

    List<NovaLoja> lojas = NovaLoja.lojas();
    //lojas.stream().forEach(novaLoja -> System.out.println(novaLoja.getPreco()));
    //acharPrecos(lojas);

    final Executor executor = Executors.newFixedThreadPool(Math.min(lojas.size(), 50),
        r -> {
          Thread t = new Thread(r);
          t.setDaemon(true);
          return t;
        });

    // acharPrecosAsync(lojas, executor);
    long start = System.currentTimeMillis();
    CompletableFuture[] completableFutures = acharPrecosStream(lojas, executor)
        .map(f -> f.thenAccept(s -> System.out.println(s + "( finalizado em: " + (System.currentTimeMillis() - start) + ")")))
        .toArray(CompletableFuture[]::new);
    CompletableFuture.allOf(completableFutures).join();
    System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
  }

  public static List<String> acharPrecos(List<NovaLoja> lojas) {
    System.out.println("Stream sequencial");
    long start = System.currentTimeMillis();
    List<String> collect = lojas.stream()
        .map(NovaLoja::getPreco)
        .map(Orcamento::parse)
        .map(Desconto::calcularDesconto)
        .collect(Collectors.toList());
    System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
    System.out.println(collect);
    return collect;
  }

  public static List<String> acharPrecosAsync(List<NovaLoja> lojas, Executor executor) {
    System.out.println("Completable future Async com executor especial");
    long start = System.currentTimeMillis();

    List<CompletableFuture<String>> completableFuture = lojas.stream()
        //Pegando o preco original de forma async
        .map(loja -> CompletableFuture.supplyAsync(loja::getPreco, executor))
        //Transforma a String em um orcamento no momento em que ela se torna disponivel
        .map(future -> future.thenApply(Orcamento::parse))
        //Compoem o primeiro future com mais uma chamada async, para pegar os descontos no momento que a primeira chamada async(CompletableFuture.supplyAsync) estiver disponivel
        // thenCompose espera o supplyAsync
        .map(future -> future.thenCompose(orcamento -> CompletableFuture.supplyAsync(() -> Desconto.calcularDesconto(orcamento), executor)))
        .collect(Collectors.toList());

    //Espera todos os futures no stream finalizarem para terem seu resultados extraidos
    List<String> collect = completableFuture.stream()
        .map(CompletableFuture::join).collect(Collectors.toList());

    System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
    System.out.println(collect);
    return collect;
  }

  public static Stream<CompletableFuture<String>> acharPrecosStream(List<NovaLoja> lojas, Executor executor) {
    System.out.println("Completable future Async STREAM com executor especial");
    long start = System.currentTimeMillis();

    Stream<CompletableFuture<String>> completableFutureStream = lojas.stream()
        .map(loja -> CompletableFuture.supplyAsync(loja::getPreco, executor))
        .map(future -> future.thenApply(Orcamento::parse))
        .map(future -> future.thenCompose(orcamento -> CompletableFuture.supplyAsync(() -> Desconto.calcularDesconto(orcamento), executor)));

    System.out.println("Tempo total: " + (System.currentTimeMillis() - start) + " ms");
    return completableFutureStream;
  }
}
