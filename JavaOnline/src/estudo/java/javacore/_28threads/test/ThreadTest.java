package estudo.java.javacore._28threads.test;

/**
 Tipos de Threads: Daemon e User
 A JVM não para enquanto tiver uma "Thread User" funcionando, mas se tiver somente "thread Daemon" e para normalmente.
 Exemplo de thread Daemo: Garbage Collector

 Duas formas para implementar threads,
 - Extender classe Thread (Só é uma boa pratica se vc for especializa-la)
 - Implementando a interface Runnable (Melhor pratica)
 */

class ThreadExemplo extends Thread {
  private char c;

  public ThreadExemplo(char c) {
    this.c = c;
  }

  @Override
  public void run() {
    System.out.println("Thread em execução: "+Thread.currentThread().getName());
    for (int i = 0; i < 1000; i++) {
      System.out.print(c);
      if (i % 100 == 0) {
        System.out.println();
      }
    }
  }
}

class ThreadExemploRunnable implements Runnable {
  private char c;

  public ThreadExemploRunnable(char c) {
    this.c = c;
  }

  @Override
  public void run() {
    System.out.println("Thread em execução: "+Thread.currentThread().getName());
    for (int i = 0; i < 1000; i++) {
      System.out.print(c);
      if (i % 100 == 0) {
        System.out.println();
      }
    }
  }
}

public class ThreadTest {

  public static void main(String[] args) {
    /**
     Se vc executar a Thread com run, vai executar somente uma Thread por vez, op correto é utilizar o comando "start"
     t1.run();    t2.run();    t3.run();    t4.run();
     */
//    ThreadExemplo t1 = new ThreadExemplo('A');
//    ThreadExemplo t2 = new ThreadExemplo('B');
//    ThreadExemplo t3 = new ThreadExemplo('C');
//    ThreadExemplo t4 = new ThreadExemplo('D');

//    t1.start();
//    t2.start();
//    t3.start();
//    t4.start();
    //--------------------------------------------
    Thread td1 = new Thread(new ThreadExemploRunnable('A'));
    Thread td2 = new Thread(new ThreadExemploRunnable('B'));
    Thread td3 = new Thread(new ThreadExemploRunnable('C'));
    Thread td4 = new Thread(new ThreadExemploRunnable('D'));

    td1.start();
    td2.start();
    td3.start();
    td4.start();

  }
}
