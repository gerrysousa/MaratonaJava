package estudo.java.javacore._26Generics.tests;

import estudo.java.javacore._26Generics.classes.Carro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Bike {

  public void andar() {
    System.out.println("Bike andando...");
  }
}

public class ClassesAnonimasTest {

  public static void main(String[] args) {
    Bike b = new Bike() {
      public void andar() {
        System.out.println("Bike andando anomimamente...");
      }
    };
    b.andar();

    List<Carro> carroList = new ArrayList<>();
    carroList.add(new Carro("BMW"));
    carroList.add(new Carro("Audi"));

    Collections.sort(carroList, new Comparator<Carro>() {
      @Override
      public int compare(Carro o1, Carro o2) {
        return o1.getNome().compareTo(o2.getNome());
      }
    });
    System.out.println(carroList);
  }
} 
