package estudo.java.javacore._37completablefuture.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTest {
  private static ExecutorService executorService = Executors.newFixedThreadPool(1);

  public static void main(String[] args) {
    Future<Double> future = executorService.submit(new Callable<Double>() {
      @Override
      public Double call() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        return 2000D;
      }
    });
    enrolando();
    try {
      /***
       Double resultadoAsync = future.get(1, TimeUnit.SECONDS);
       Se colocarmos o timout de 1 segundo vai ser lançado exceção, pois o pressamento do future leva no minimo 2 segundos do sleep

       Se colocarmos o timout de 5 segundos o programa vai esperar no maximo 5 segundos, se não tiver resultado ele lança uma exceção,
       Double resultadoAsync = future.get(5, TimeUnit.SECONDS);
       ----------
       Também podemos fazer a chamada do future sem passar timeout como  abaixo:
       Double resultadoAsync = future.get();

       Com o codigo abaixo o codigo ficaria sincrono novamente.
       while (!future.isDone()){
       Double resultadoAsync2 = future.get();
       System.out.println("Resultado async: "+resultadoAsync2);
       }
       */
      Double resultadoAsync = future.get(3, TimeUnit.SECONDS);
      System.out.println("Resultado async: " + resultadoAsync);

    } catch (InterruptedException | ExecutionException | TimeoutException e) {
      e.printStackTrace();
    } finally {
      executorService.shutdown();
    }

  }

  public static void enrolando() {
    long soma = 0;
    for (int i = 0;i<1_000_000;i++){
      soma +=i;
    }
    System.out.println("Enrolando. Soma="+soma);
  }
}
