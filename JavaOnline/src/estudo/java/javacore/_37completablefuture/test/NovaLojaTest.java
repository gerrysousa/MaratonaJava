package estudo.java.javacore._37completablefuture.test;

import estudo.java.javacore._37completablefuture.classes.Desconto;
import estudo.java.javacore._37completablefuture.classes.Loja;
import estudo.java.javacore._37completablefuture.classes.NovaLoja;
import estudo.java.javacore._37completablefuture.classes.Orcamento;
import java.util.List;
import java.util.stream.Collectors;

public class NovaLojaTest {

  public static void main(String[] args) {
    List<NovaLoja> lojas = NovaLoja.lojas();

    //lojas.stream().forEach(novaLoja -> System.out.println(novaLoja.getPreco()));
    acharPrecos(lojas);
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
}
