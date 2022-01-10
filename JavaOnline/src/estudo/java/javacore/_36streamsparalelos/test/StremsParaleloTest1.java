package estudo.java.javacore._36streamsparalelos.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StremsParaleloTest1 {

  public static void main(String[] args) {
    long num = 10_000_000_000L;
    somaFor(num);
//    somaStreamIterate(num);
//    somaParallelStreamIterate(num);
    somaRangeClosedStream(num);
    somaParallelRangeClosedStream(num);
  }

  public static void somaFor(long num) {
    System.out.println("Soma For");
    long result = 0;
    long init = System.currentTimeMillis();
    for (long i = 0; i <= num; i++) {
      result += i;
    }
    long end = System.currentTimeMillis();

    System.out.println("Soma="+result +", tempo="+(end-init)+"ms");
  }

  public static void somaStreamIterate(long num) {
    System.out.println("Soma Stream Iterate");
    long result = 0;
    long init = System.currentTimeMillis();
    result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
    long end = System.currentTimeMillis();

    System.out.println("Soma=" + result + ", tempo=" + (end - init) + "ms");
  }

  public static void somaParallelStreamIterate(long num) {
    System.out.println("Soma Parallel Stream Iterate");
    long result = 0;
    long init = System.currentTimeMillis();
    result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
    long end = System.currentTimeMillis();

    System.out.println("Soma=" + result + ", tempo=" + (end - init) + "ms");
  }

  public static void somaRangeClosedStream(long num) {
    System.out.println("soma Range Closed Stream");
    long result = 0;
    long init = System.currentTimeMillis();
    result = LongStream.rangeClosed(1l,num).reduce(0L, Long::sum);
    long end = System.currentTimeMillis();

    System.out.println("Soma=" + result + ", tempo=" + (end - init) + "ms");
  }

  public static void somaParallelRangeClosedStream(long num) {
    System.out.println("soma Parallel Range Closed Stream");
    long result = 0;
    long init = System.currentTimeMillis();
    result = LongStream.rangeClosed(1l,num).parallel().reduce(0L, Long::sum);
    long end = System.currentTimeMillis();

    System.out.println("Soma=" + result + ", tempo=" + (end - init) + "ms");
  }
}
