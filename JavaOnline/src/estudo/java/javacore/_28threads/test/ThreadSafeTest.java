package estudo.java.javacore._28threads.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ListaNomeQuePodeOcorrerIndexOutOfBoundsException {

  private List<String> nomes = Collections.synchronizedList(new LinkedList<>());

  public void add(String nome) {
    nomes.add(nome);
  }

  public void removerPrimeiro() {
    if (nomes.size() > 0) {
      System.out.println(nomes.remove(0));
    }
  }
}

class ListaNome {

  private List<String> nomes = new LinkedList<>();

  public synchronized void add(String nome) {
    nomes.add(nome);
  }

  public synchronized void removerPrimeiro() {
    if (nomes.size() > 0) {
      System.out.println(nomes.remove(0));
    }
  }
}

public class ThreadSafeTest {

  public static void main(String[] args) {
    ListaNome nome = new ListaNome();
    nome.add("Bastião");

    class RemovedorDeNomes extends Thread {
      public void run() {
        nome.removerPrimeiro();
      }
    }

    new RemovedorDeNomes().start();
    new RemovedorDeNomes().start();
  }
}
