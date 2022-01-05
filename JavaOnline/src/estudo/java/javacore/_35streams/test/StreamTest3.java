package estudo.java.javacore._35streams.test;

import estudo.java.javacore._35streams.classes.Pessoa;
import java.util.Comparator;
import java.util.List;

public class StreamTest3 {

  public static void main(String[] args) {
    List<Pessoa> pessoas = Pessoa.bancoDePessoas();
    System.out.println(pessoas.stream().anyMatch(pessoa -> pessoa.getSalario() > 4000));
    System.out.println(pessoas.stream().allMatch(pessoa -> pessoa.getIdade() > 20));
    System.out.println(pessoas.stream().noneMatch(pessoa -> pessoa.getIdade() < 18));

    pessoas.stream()
        .filter(pessoa -> pessoa.getIdade() < 25)
        .findAny()
        .ifPresent(pessoa -> System.out.println(pessoa.getNome()));

    pessoas.stream()
        .filter(pessoa -> pessoa.getIdade() > 30)
        .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
        .findFirst()
        .ifPresent(pessoa -> System.out.println(pessoa.getNome()));
  }
}
