package estudo.java.javacore._28threads.test;

public class DeadLockerTest {
  private static Object lock1 = new Object();
  private static Object lock2 = new Object();

  public static void main(String[] args) {
    new ThreadExemplo1().start();
    new ThreadExemplo2().start();
  }

  private static class ThreadExemplo1 extends Thread{
    public void run(){
      synchronized (lock1){
        System.out.println("Thread 1: segurando lock1");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("Thread 1: esperando lock2");
        synchronized (lock2){
          System.out.println("Thread 1: segurando lock1 e lock 2");
        }
      }
    }
  }

  private static class ThreadExemplo2 extends Thread{
    public void run(){
      synchronized (lock1){//se inverter acontece o deadlock
        System.out.println("Thread 2: segurando lock2");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("Thread 2: esperando lock1");
        synchronized (lock2){//se inverter acontece o deadlock
          System.out.println("Thread 2: segurando lock2 e lock 1");
        }
      }
    }
  }
}
