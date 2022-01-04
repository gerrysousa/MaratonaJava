package estudo.java.javacore._35streams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static  java.util.Arrays.asList;

public class StreamTest2 {

  public static void main(String[] args) {
    List<List<String>> nomes = new ArrayList<>();
    nomes.add(asList("Bastiao", "Tiao"));
    nomes.add(asList("Ze das couves", "Jose"));
    System.out.println(nomes);

    Stream<String> stringStream = nomes.stream().flatMap(Collection::stream);
    stringStream.forEach(System.out::println);

    List<String> collect = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
    collect.forEach(System.out::println);
    System.out.println(collect);

    List<String> palavras = asList("Ola", "Goku");
    String[] split = palavras.get(0).split("");
    System.out.println(Arrays.asList(split));

    List<String[]> collect1 = palavras.stream()
        .map(p -> p.split(""))
        .collect(Collectors.toList());
    //Stream<String> stream = Arrays.stream((String[]) palavras.toArray());
    System.out.println(collect1);

    List<String> collect2 = palavras.stream()
        .map(p -> p.split(""))
        .flatMap(Arrays::stream)
        .collect(Collectors.toList());
    System.out.println(collect2);
  }
}
