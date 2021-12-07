package estudo.java.javacore._29concorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class ThreadTrabalhadoraExecutor implements Runnable {

  private String num;

  public ThreadTrabalhadoraExecutor(String num) {
    this.num = num;
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName()+" iniciou "+num);
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(Thread.currentThread().getName()+" finalizou");
  }
}

public class ExecutorTest {

  public static void main(String[] args) {
    System.out.println("Quantidade de processadores da maquina: "+Runtime.getRuntime().availableProcessors());
    /**
      ExecutorService executorService =
      - Executors.newFixedThreadPool(3): vc pode limitar a quantidade de threads que podem ser criadas
      - Executors.newCachedThreadPool(): vai criando a quantidade de threads necessarias, elas são finalizadas se ficarem 60s ociosas
      - Executors.newSingleThreadExecutor(): somente uma thread é criada, ele não pode aumentar a quantidade de threads como o newFixedThreadPool(3)
     */
   // ExecutorService executorService = Executors.newFixedThreadPool(3);
    ExecutorService executorService = Executors.newSingleThreadExecutor() ;

    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
    threadPoolExecutor.setMaximumPoolSize(10);
    threadPoolExecutor.setCorePoolSize(Runtime.getRuntime().availableProcessors());

    executorService.execute(new ThreadTrabalhadoraExecutor("1"));
    executorService.execute(new ThreadTrabalhadoraExecutor("2"));
    executorService.execute(new ThreadTrabalhadoraExecutor("3"));
    executorService.execute(new ThreadTrabalhadoraExecutor("4"));
    executorService.execute(new ThreadTrabalhadoraExecutor("5"));
    executorService.execute(new ThreadTrabalhadoraExecutor("6"));
    executorService.execute(new ThreadTrabalhadoraExecutor("7"));
    executorService.execute(new ThreadTrabalhadoraExecutor("8"));
    executorService.shutdown();
    while (!executorService.isTerminated()){}
    System.out.println("Finalizado: "+executorService.isTerminated());

  }
}
