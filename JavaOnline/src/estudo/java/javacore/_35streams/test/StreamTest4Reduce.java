package estudo.java.javacore._35streams.test;

import static java.util.Arrays.asList;

import estudo.java.javacore._35streams.classes.Pessoa;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamTest4Reduce {

  public static void main(String[] args) {
    /**
     Como o stream foi consumido anteriormente por um metodo final, ele deixa de exitir, por isso essa linha abaixo
     stream = asList(1,2,3,4,5,6).stream();

     selecionar o stream "asList(1,2,3,4,5,6).stream()">> refactor>> extract>> method>>
     */
    Optional<Integer> soma1 = getStream().reduce((x, y) -> x + y);
    System.out.println(soma1.get());

    Integer soma2 = getStream().reduce(0, (x, y) -> x + y);
    System.out.println(soma2);

    Optional<Integer> soma3 = getStream().reduce(Integer::sum);
    System.out.println(soma3.get());

    Optional<Integer> mult1 = getStream().reduce((x, y) -> x * y);
    System.out.println(mult1.get());

    Integer mult2 = getStream().reduce(1, (x, y) -> x * y);
    System.out.println(mult2);

    Optional<Integer> max1 = getStream().reduce((x, y) -> x > y ? x : y);
    System.out.println(max1.get());

    Optional<Integer> max2 = getStream().reduce(Integer::max);
    //Optional<Integer> min = getStream().reduce(Integer::min);
    System.out.println(max2.get());

    Stream<Pessoa> pessoaStream = Pessoa.bancoDePessoas().stream();
    Optional<Double> somaSalario = pessoaStream.filter(pessoa -> pessoa.getSalario() > 4000)
        .map(Pessoa::getSalario)
        .reduce(Double::sum);
    System.out.println(somaSalario.get());

    //mapToDouble: Esse é mais perfomatico que o de cima para o caso da soma
    Double somaSalario2 = Pessoa.bancoDePessoas().stream().filter(pessoa -> pessoa.getSalario() > 4000)
        .mapToDouble(Pessoa::getSalario)
        .sum();
    System.out.println(somaSalario2);

    DoubleStream doubleStream = Pessoa.bancoDePessoas().stream().filter(pessoa -> pessoa.getSalario() > 4000)
        .mapToDouble(Pessoa::getSalario);
    //Se quiser voltar para um stream de double usar o metodo abaixo;
    Stream<Double> somaSalario2Stream = doubleStream.boxed();
  }

  private static Stream<Integer> getStream() {
    return asList(1, 2, 3, 4, 5, 6).stream();
  }

  public static void metodoSemRefactor() {
    Stream<Integer> stream = asList(1, 2, 3, 4, 5, 6).stream();
    Optional<Integer> reduce = stream.reduce((x, y) -> x + y);
    System.out.println(reduce.get());

    /**
     Como o stream foi consumido anteriormente por um metodo final, ele deixa de exitir, por isso essa linha abaixo
     stream = asList(1,2,3,4,5,6).stream();
     */
    stream = asList(1, 2, 3, 4, 5, 6).stream();
    Integer soma = stream.reduce(0, (x, y) -> x + y);
    System.out.println(soma);

    stream = asList(1, 2, 3, 4, 5, 6).stream();
    Optional<Integer> soma3 = stream.reduce(Integer::sum);
    System.out.println(soma3.get());
  }
}

