package estudo.java.javacore._26Generics.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * O wild card entende-se assim
 "? extends Comparable" -> (objeto(?) é um comparable)
 */

abstract class Animal{
  public abstract void consulta();
}

class Cachorro extends Animal implements Comparable{
  @Override
  public void consulta() {
    System.out.println("Consultando Cachorro");
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}

class Gato extends Animal{
  @Override
  public void consulta() {
    System.out.println("Consultando Gato");
  }
}

public class WildCardTest {

  public static void main(String[] args) {
    Cachorro[] cachorros = { new Cachorro(), new Cachorro()};
    Gato[] gatos = {new Gato(), new Gato()};
    consultarAnimais(cachorros);
    consultarAnimais(gatos);
    List<Cachorro> cachorroList = new ArrayList<>();
    cachorroList.add(new Cachorro());
    List<Gato> gatoList = new ArrayList<>();
    gatoList.add(new Gato());

    consultarAnimaisList(cachorroList);
    consultarAnimaisList(gatoList);
    ordenarLista(cachorroList);
  }

  public static void consultarAnimais(Animal[] animais){
    for (Animal animal : animais){
      animal.consulta();
    }
  }

  //type erasure | ?
  public static void consultarAnimaisList(List<? extends Animal> animais){
    for (Animal animal : animais){
      System.out.println(animal);
    }
  }

  public static void consultarCachorroList(List<? super Cachorro> cachorroList){
    Cachorro c1 = new Cachorro();
    Animal c2 = new Cachorro();
    Object c3 = new Cachorro();
    cachorroList.add(new Cachorro());
  }

  private static void ordenarLista(List<? extends Comparable> lista) {
    Collections.sort(lista);
  }
}
