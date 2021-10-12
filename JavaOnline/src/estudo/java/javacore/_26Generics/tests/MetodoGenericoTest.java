package estudo.java.javacore._26Generics.tests;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest {

  public static void main(String[] args) {
    criarArray(new Cachorro());
    List<Cachorro> lista1 = criarArray2(new Cachorro());

    criarArray3(new Cachorro());
    criarArray3(new Gato());
  }

  public static <T> void criarArray(T t) {
    System.out.println("Metodo sem retorno");
    List<T> lista = new ArrayList<>();
    lista.add(t);
    System.out.println(lista);
  }

  public static <T> List<T> criarArray2(T t) {
    System.out.println("Metodo com retorno");
    List<T> lista = new ArrayList<>();
    lista.add(t);
    System.out.println(lista);
    return lista;
  }

  public static <T extends Animal> void criarArray3(T t) {
    System.out.println("Metodo sem retorno aceita herancas de animal");
    List<T> lista = new ArrayList<>();
    lista.add(t);
    System.out.println(lista);
  }
}
