package estudo.java.javacore._25colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

  public static void main(String[] args) {
    Queue<String> queue = new PriorityQueue<>();
    queue.add("D");
    queue.add("B");
    queue.add("A");
    queue.add("E");
    queue.add("C");
    System.out.println("Fila: \n"+queue);
    System.out.println("peek - retorna o primeiro elemento da Fila: "+queue.peek());
    System.out.println("Fila: \n"+queue);
    System.out.println("poll - retorna o primeiro elemento da Fila e o remove: "+queue.poll());
    System.out.println("Fila: \n"+queue);
    System.out.println("offer - retorna se conseguiu inserir na fila: "+queue.offer("F"));
    System.out.println("quando a fila tem um limite melhor usar offer do que o add, pois add lança exeção ");
    System.out.println("Fila: \n"+queue);
    System.out.println("remove - remove o primeiro elemento da Fila: "+queue.remove());
    System.out.println("Fila: \n"+queue);
    System.out.println("remove com parametro - remove o primeiro elemento da Fila: "+queue.remove("E"));
    System.out.println("Fila: \n"+queue);

  }
}
