package estudo.java.javacore._28threads.test;

import estudo.java.javacore._28threads.classes.Conta;

/***
 vc pode sincronizar um metodo(ex.: saque)  ou um bloco de codigo (ex.: saque2)

 - metodos estáticos vão trabalhar com o LOCK da classe, metodos não estáticos vão trabalhar com o LOCK da instância

 */

public class ContaTest implements Runnable {

  private Conta conta = new Conta();

  public static void main(String[] args) {
    ContaTest contaTest = new ContaTest();
    Thread bastiao = new Thread(contaTest, "Bastiao");
    Thread bastiana = new Thread(contaTest, "Bastiana");

    bastiao.start();
    bastiana.start();
  }

  private synchronized void saque(int valor) {
    if (conta.getSaldo() >= valor) {
      System.out.println(Thread.currentThread().getName() + " está indo sacar");
      conta.saque(valor);
      System.out.println(Thread.currentThread().getName() + " completou o saque, saldo atual é: " + conta.getSaldo());
    } else {
      System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, saldo atual é: " + conta.getSaldo());
    }
  }

  private void saque2(int valor) {
    synchronized (conta) {
      if (conta.getSaldo() >= valor) {
        System.out.println(Thread.currentThread().getName() + " está indo sacar");
        conta.saque(valor);
        System.out.println(Thread.currentThread().getName() + " completou o saque, saldo atual é: " + conta.getSaldo());
      } else {
        System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, saldo atual é: " + conta.getSaldo());
      }
    }
  }

  public static synchronized void imprime(){
    System.out.println("Exemplo bloqueando a classe atual");
  }

  public static void imprime2(){
    synchronized (ContaTest.class) {
      System.out.println("Exemplo2 bloqueando a classe atual");
    }
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      saque(10);
      if (conta.getSaldo() < 0) {
        System.out.println("Vish, não dá pra sacar!!!");
      }
    }
  }
}
