package estudo.java.javacore._29concorrencia.classes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ListaMembros {

  private final ReentrantLock reentrantLock = new ReentrantLock();
  private final Condition conditionLock = reentrantLock.newCondition();
  private final Queue<String> emails = new LinkedList<>();
  private boolean aberta = true;

  public int getEmailsPendendes() {
    reentrantLock.lock();
    try {
      return this.emails.size();
    } finally {
      reentrantLock.unlock();
    }
  }

  public boolean isAberta() {
    return aberta;
  }

  public String obterEmailMembro() {
    String email = null;

    try {
      reentrantLock.lock();
      while (this.emails.size() == 0) {
        if (!aberta) {
          return null;
        }
        System.out.println("Lista vazia, colocando a thread: " + Thread.currentThread().getName() + " em modo wait!");
        conditionLock.await();
      }
      email = this.emails.poll();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      reentrantLock.unlock();
    }
    return email;
  }

  public void adicionarEmailMembro(String email) {
    reentrantLock.lock();
    try {
      this.emails.add(email);
      System.out.println("Email addicionado na lista!");
      System.out.println("Notificando as threads que estão em espera");
      conditionLock.signalAll();
    } finally {
      reentrantLock.unlock();
    }
  }

  public void fecharLista() {
    reentrantLock.lock();
    try {
      System.out.println("Notificando todas as threads e fechando a lista");
      aberta = false;
      conditionLock.signalAll();
    } finally {
      reentrantLock.unlock();
    }
  }
}
