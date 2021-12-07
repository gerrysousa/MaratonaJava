package estudo.java.javacore._29concorrencia.test;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/***
 - BlockingQueues é a forma de vc transferir dados entre duas threads, sendo que uma thread espere a outra até o momento que o dados for trocado
 - producer and consumer: a fila é FIFO - first in first out
 - SynchronousQueue: ela fica bloqueada até que outra thread execute uma ação oposta( Se a thread executa o REMOVER, ela fica esperando uma Thread ADICIONAR, e vice-versa)
 - DelayQueue: Ela força uma espera para objetos que não podem ser consumidos antes de uma determinada quantidade de tempo
 - LinkedTransferQueue
 */

public class BlockingQueueTest {

  public static void main(String[] args) throws InterruptedException {
    BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
    Thread t1 = new Thread(new RemoveFromQueue(bq));

    bq.put("Bastião");
    System.out.println(bq.peek());
    System.out.println("Tentando inserir novo valor");
    t1.start();
    bq.put("novo valor");
    System.out.println("Valor inserido");
  }

  static class RemoveFromQueue implements Runnable {

    private BlockingQueue<String> bq;

    public RemoveFromQueue(BlockingQueue<String> bq) {
      this.bq = bq;
    }

    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName()+" Entrando em espera por 3 segundos");

      try {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Removendo valor: "+bq.take());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
