package estudo.java.javacore._32lambdas.test;

import static java.util.Arrays.asList;

import estudo.java.javacore._31comportamentoporparametro.classes.Carro;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest2 {
  /***
   Predicate<String> p = (String s) -> listCores.add(s);
   p.test("amarelo");

   Apesar do metodo p.test() retornar um booleano,
   é possivel fazez ele executar outra função (listCores.add(s)) por que a execução é um statement valido que será compilado

   Está implicito para o java que vc vai utilizar algumas variaveis, por isso dá pra reduzir algumas expressões lambdas.
   List<String>listCores = map(carros, (Carro c) ->c.getCor());
   List<String>listCores = map(carros, c ->c.getCor());

   Consumer<String> cs = (String s)-> listCores.add(s);
   Consumer<String> cs = s -> listCores.add(s);

   Variavel deve ser efetivament final para usar ela no lambda.
   static String cor1 = "cinza";
   ou
   final String cor1 = "cinza";
   ou
   String cor1 = "cinza";// se for assim, ela não pode ser alterada depois do lambda.

   */


  public static void main(String[] args) {
    forEach(asList("Bastiao", "Ze das Couves", "Fulano"), (String s) -> System.out.println(s));

    List<Integer> list = map(asList("Bastiao", "Ze das Couves", "Fulano"), (String s) -> s.length());
    System.out.println(list);

    List<Carro>carros = asList(new Carro("verde",2015), new Carro("preto", 2000), new Carro("vermelho", 2018));
    List<String>listCores = map(carros, (Carro c) ->c.getCor());
    System.out.println(listCores);

    Predicate<Integer>pares = (Integer i) -> i%2==0;
    IntPredicate impar = (int i) -> i%2==1;//  esse é mais performatico do que o "Predicate<Integer>"

    System.out.println("É par? "+pares.test(1000));
    System.out.println("É impar? "+impar.test(1000));

    Predicate<String> p = (String s) -> listCores.add(s);
    p.test("amarelo");
    System.out.println(listCores);

    Consumer<String> cs = (String s)-> listCores.add(s);
    cs.accept("laranja");
    System.out.println(listCores);

    Supplier<String> sup1 = () -> "oi";
    Supplier<Carro> sup2 = () -> new Carro("verde",2014);

    System.out.println(sup1);
    System.out.println(sup2);
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
