package estudo.java.javacore._29concorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Contador {

  private int count;
  private AtomicInteger atomicInteger = new AtomicInteger();
  private Lock lock = new ReentrantLock();

  public void increment() {
    /***
    - se colocar o metodo como "synchronized"  o count vai funcionar corretamente e retornar 20000,
    - porém "synchronized" demanda mais do processador
     */
    count++;
    atomicInteger.getAndIncrement();
  }

  public void incrementComLock() {
    /***
     - se colocar usar o "lock" o "count" vai funcionar corretamente e retornar 20000,
     - sempre que usar  "lock" é indicado usar o bloco try/finally
     */
    lock.lock();
    try{
      count++;
      atomicInteger.getAndIncrement();
    }finally {
      lock.unlock();
    }
  }


  public int getCount() {
    return count;
  }
  public int getAtomicInteger(){
    return atomicInteger.intValue();
  }
}

class IncrementadorThread extends Thread {

  private Contador contador;

  public IncrementadorThread(Contador contador) {
    this.contador = contador;
  }

  public void run() {
    for (int i = 0; i < 10000; i++) {
      contador.increment();
    }
  }
}

public class ConcorrenciaTest {

  public static void main(String[] args) throws InterruptedException {
    Contador c = new Contador();
    IncrementadorThread it1 = new IncrementadorThread(c);
    IncrementadorThread it2 = new IncrementadorThread(c);
    it1.start();
    it2.start();
    it1.join();
    it2.join();
    System.out.println(c.getCount());
    System.out.println(c.getAtomicInteger());
  }

}
