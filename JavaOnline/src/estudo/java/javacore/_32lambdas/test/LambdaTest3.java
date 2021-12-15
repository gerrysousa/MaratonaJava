package estudo.java.javacore._32lambdas.test;


import static java.util.Arrays.asList;

import estudo.java.javacore._32lambdas.classes.Carro;
import estudo.java.javacore._32lambdas.classes.ComparadorCarros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaTest3 {

  public static void main(String[] args) {
    //forEach(asList("Bastiao", "Ze das Couves", "Fulano"), (String s) -> System.out.println(s));
    forEach(asList("Bastiao", "Ze das Couves", "Fulano"), System.out::println); //mesmas coisa do lambda acima

    List<Carro> carros = asList(new Carro("verde", 2015), new Carro("preto", 2000), new Carro("vermelho", 1990));
    //Reference to a static method
    Collections.sort(carros, ComparadorCarros::comparePorCor);
    System.out.println(carros);

    //Reference to an instance method of a particular object
    ComparadorCarros comparadorCarro = new ComparadorCarros();
    Collections.sort(carros, comparadorCarro::comparePorAno);
    System.out.println(carros);

    //Reference to an instance method of an arbitrary object of a particular type
    List<String> nomes = asList("Bastiao", "Ze das Couves", "Fulano");
    nomes.sort((s1, s2) -> s1.compareTo(s2));//
    nomes.sort(String::compareTo);//mesa coisa que nomes.sort((s1,s2)-> s1.compareTo(s2))
    System.out.println(nomes);
    nomes.sort((s1, s2) -> s2.compareTo(s1));//ordem inversa
    System.out.println(nomes);

    Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);//Function<String, Integer> :  String é o parametro, e Integer é o retorno
    Function<String, Integer> stringToInteger2 = Integer::parseInt;//Mesma coisa que Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
    System.out.println(stringToInteger.apply("15"));

    BiPredicate<List<String>, String> contains = (lista, elemento) -> lista.contains(elemento);
    BiPredicate<List<String>, String> contains2 = List::contains;
    System.out.println(contains.test(nomes, "Bastiao"));
    System.out.println(contains2.test(nomes, "Tiao"));

    //Reference to a constructor
    Supplier<ComparadorCarros> comparadorCarrosSupplier = ComparadorCarros::new;
    System.out.println("Para obter o objeto -> " + comparadorCarrosSupplier.get());
    Collections.sort(carros, comparadorCarrosSupplier.get()::comparePorAno);
    System.out.println(carros);

    BiFunction<String, Integer, Carro> carroBiFunction = (s, i) -> new Carro(s, i);
    BiFunction<String, Integer, Carro> carroBiFunction2 = Carro::new;
    System.out.println(carroBiFunction.apply("marrom", 1989));
    System.out.println(carroBiFunction2.apply("amarelo", 1998));
  }


  public static <T> void forEach(List<T> list, Consumer<T> c) {
    for (T e : list) {
      c.accept(e);
    }
  }

  public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
    List<R> result = new ArrayList<>();
    for (T e : list) {
      result.add(f.apply(e));
    }
    return result;
  }
}
