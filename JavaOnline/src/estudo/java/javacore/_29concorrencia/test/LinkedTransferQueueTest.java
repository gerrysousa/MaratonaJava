package estudo.java.javacore._29concorrencia.test;

import java.sql.SQLOutput;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest {

  public static void main(String[] args) throws InterruptedException {


    TransferQueue<String> tq = new LinkedTransferQueue<>();
    System.out.println("Retorna true se for inserido, e false se não for: "+tq.add("Bastião"));
    System.out.println("Capacidade: "+tq.remainingCapacity());
    tq.put("Zé");

    System.out.println("Retorna true se for inserido, e false se não for: "+tq.offer("Add Novo"));
    System.out.println("Retorna true se for inserido, e false se não for, , e espera por 10s para ser consumido: "+tq.offer("Add Novo por 10s se a fila estiver cheia,",10, TimeUnit.SECONDS ));
    //tq.transfer("Add Novo3");// Ele fica executando, e espera outra fila pra remover/transferir o valor
    System.out.println("Retorna TRUE se tiver uma thread esperando pra consumir o valor, e FALSE não tiver thread esperando: "+tq.tryTransfer("Add Novo3"));
    System.out.println("Retorna TRUE se tiver uma thread esperando pra consumir o valor, e FALSE não tiver thread esperando, e espera por 10s para ser consumido: "+tq.tryTransfer("Add Novo3",10, TimeUnit.SECONDS));

    System.out.println("Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty. "+tq.element());
    System.out.println("Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty. "+tq.peek());
    System.out.println("Retrieves and removes the head of this queue, or returns null if this queue is empty. "+tq.poll());
    System.out.println("Retrieves and removes the head of this queue, waiting up to the specified wait time if necessary for an element to become available."+tq.poll(10, TimeUnit.SECONDS));
    System.out.println("Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty."+tq.remove());
    System.out.println("Retrieves and removes the head of this queue, waiting if necessary until an element becomes available."+tq.take());
  }
}
