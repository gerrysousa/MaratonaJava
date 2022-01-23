package estudo.java.javacore._37completablefuture.classes;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Desconto {

  public enum Codigo {
    NENHUM(0), SILVER(5), GOLD(10), PLATINUM(15), ELITE(20);
    private final int porcentagem;

    Codigo(int porcentagem) {
      this.porcentagem = porcentagem;
    }

    public int getPorcentagem() {
      return porcentagem;
    }
  }

  public static String calcularDesconto(Orcamento orcamento) {
    return String.format("Na %s o preço original eh: %.2f, desconto: %d, preco final: %.2f",
        orcamento.getNomeDaLoja(),
        orcamento.getPreço(),
        orcamento.getCodigoDesconto().getPorcentagem(),
        calculo(orcamento.getPreço(), orcamento.getCodigoDesconto()));
  }

  private static double calculo(double preco, Codigo codigo) {
    delay();
    return preco * (100 - codigo.porcentagem) / 100;
  }

  public static void delay() {
    try {
      int delay = ThreadLocalRandom.current().nextInt(500, 2000);
      TimeUnit.MILLISECONDS.sleep(delay);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
