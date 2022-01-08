package estudo.java.javacore._35streams.test;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

import estudo.java.javacore._35streams.classes.Pessoa;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest6Collectors1 {

  //Redução e sumarização de streams em um valor unico
  //Agrupamento de elementos
  //Particionamento de elementos
  public static void main(String[] args) {
    List<Pessoa> pessoas = Pessoa.bancoDePessoas();
    System.out.println(pessoas.stream().count());
    System.out.println(pessoas.stream().collect(counting()));

    Optional<Pessoa> max = pessoas.stream().max(comparing(Pessoa::getSalario));
    System.out.println(max.get().getSalario());
    Optional<Pessoa> maxCollect = pessoas.stream().collect(maxBy(comparing(Pessoa::getSalario)));
    System.out.println(maxCollect.get().getSalario());

    Optional<Pessoa> minCollect = pessoas.stream().collect(minBy(comparing(Pessoa::getSalario)));
    System.out.println(minCollect.get().getSalario());

    System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).sum());
    System.out.println(pessoas.stream().collect(summingDouble(Pessoa::getSalario)));

    System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).average());
    System.out.println(pessoas.stream().collect(averagingDouble(Pessoa::getSalario)));

    DoubleSummaryStatistics collectSumario = pessoas.stream().collect(summarizingDouble(Pessoa::getSalario));
    System.out.println(collectSumario);
    System.out.println("Max: " + collectSumario.getMax());

    System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining()));
    System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining(", ")));
  }
}
