package estudo.java.javacore._35streams.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest5GerandoStreams {

  public static void main(String[] args) {
    /***
     * rangeClosed = inclui os numeros entre parenteses.
     * range = não inclui os numeros entre parenteses.
     */
    IntStream.rangeClosed(1, 20).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));
    System.out.println();
    IntStream.range(1, 20).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));
    //=============================================
    System.out.println();
    Stream<String> stringStream = Stream.of("Seja", "bem", "vindo", "a", "selva");
    stringStream.map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
    //=============================================
    Stream<String> stringEmpty = Stream.empty();
    //=============================================
    int num[] = {1, 2, 3, 4, 5, 6};
    IntStream arrayStream = Arrays.stream(num);
    System.out.println("media: " + arrayStream.average().getAsDouble());
    arrayStream = Arrays.stream(num);
    System.out.println("max: " + arrayStream.max().getAsInt());
    arrayStream = Arrays.stream(num);
    System.out.println("min: " + arrayStream.min().getAsInt());
    //=============================================
    try (Stream<String> lines = Files.lines(Paths.get("pasta/Teste.txt"), Charset.defaultCharset())) {
      lines.flatMap(line -> Arrays.stream(line.split("\n")))
          .filter(p -> p.contains("File"))
          .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
    //=============================================
    Stream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);
    //0,1,1,2,3,5,8,13,21
    //(0,1),(1,1),(1,2),(2,3),(3,5)
    Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0] + a[1]})
        .limit(5)
        .forEach(t -> System.out.println(Arrays.toString(t)));

    Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0] + a[1]})
        .limit(10)
        .map(t -> t[0])
        .forEach(System.out::println);
    //=============================================
    Stream.generate(Math::random).limit(10).forEach(System.out::println);
    ThreadLocalRandom t = ThreadLocalRandom.current();
    Stream.generate(() -> t.nextInt(1, 100)).limit(10).forEach(System.out::println);
  }
}
