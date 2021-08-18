package estudo.java.javacore._25colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListasArrayTest {

  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();
    numeros.add(2);
    numeros.add(0);
    numeros.add(5);
    numeros.add(4);

    Integer[] numerosArray = new Integer[numeros.size()];
    numeros.toArray(numerosArray);
    System.out.println("List numeros");
    System.out.println(numeros);
    System.out.println("Array numeros");
    System.out.println(Arrays.toString(numerosArray));
    System.out.println("--------------------------------------");

    Integer[] numerosArray2 = new Integer[4];
    numerosArray2[0]=12;
    numerosArray2[1]=10;
    numerosArray2[2]=15;
    numerosArray2[3]=14;

    List<Integer> numerosList2 = Arrays.asList(numerosArray2);
    List<Integer> numerosList3 = new ArrayList<>();
    numerosList3.addAll(Arrays.asList(numerosArray2));

    System.out.println("List numeros 2");
    System.out.println(numerosList2);
    System.out.println("Array numeros 2");
    System.out.println(Arrays.toString(numerosArray2));
    System.out.println("List numeros 3");
    System.out.println(numerosList3);

    System.out.println("--------------------------------------");
    System.out.println("Add numero 1 na posicao 0 da lista");
    numerosList2.set(0,1);
    System.out.println("List numeros 2");
    System.out.println(numerosList2);
    System.out.println("Array numeros 2");
    System.out.println(Arrays.toString(numerosArray2));
    System.out.println("List numeros 3");
    System.out.println(numerosList3);

    System.out.println("Do jeito que foi criado não dá pra add dessa forma na lista numerosList2.add(10);");
    System.out.println("Melhor utilizar o jeito do numerosList3, que não fica vinculado ao array");
    System.out.println("--------------------------------------");

  }
}
