package estudo.java.javacore._25colecoes.test;

import estudo.java.javacore._25colecoes.classes.Celular;

public class EqualsTest {

  public static void main(String[] args) {
    String nome1 = "Ze Bastiao";
    String nome2 = "Ze Bastiao";
    String nome3 = new String("Ze Bastiao");
    System.out.println("Será Verdadeiro pq utilizou o mesmo endereço no pool de strings: É igual? "+(nome1==nome2));
    System.out.println("Apesar de iguais será falso pois nome3 tem uma nova referência na memoria: É igual? "+(nome1==nome3));
    System.out.println("Utilizando o equals para comparar: "+(nome1.equals(nome3)));

    Integer int1 = 5;
    Integer int2 = new Integer(5);
    System.out.println("Comparando inteiros com == :"+(int1==int2));
    System.out.println("Comparando inteiros com equals: "+(int1.equals(int2)));

    Celular c1 = new Celular("iPhone", "123456");
    Celular c2 = new Celular("iPhone", "123456");
    System.out.println("Usando o equals da classe Celular: "+(c2.equals(c1)));
  }
}
