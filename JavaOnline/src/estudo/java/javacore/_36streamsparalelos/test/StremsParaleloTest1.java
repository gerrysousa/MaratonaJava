package estudo.java.javacore._36streamsparalelos.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StremsParaleloTest1 {

  /***
   Coisas que vc deve fazer ou levar em consideração quando for optar por streams paralelos
   - Benchmark
   - Unboxing e boxing (de valores)
   - Algumas operações são piores paralelas do que sequenciais
   --> (limit, findFirst) são ruins
   --> findAny(), unordered() (Esses podem ser bons com paralelismo)
   - Considerar custo total da computação. Fatores N (numero de elementos) , P (custo de processamento)
   - Quantidade de dados (Se for pouco dados, não compensa ser paralelo)
   - Tipos de coleções (Excelentes: ArrayList,IntStream.range),(Ruins: LinkedLis, Stream.iterate), (Bom: HashSet, TreeSet)
   - Tamanho do Stream (tamanho definido)
   - Processamento do merge

   ----------------------------------
   Codigos de Paralelismo
   Processamentos paralelos funcionam com o fork-join

   if(tarefa for pequena ou não pode ser dividida){
   faz ela sequencial
   }
   else{
   dividir em duas tarefas (Fork)
   chamar metodo recusivamente
   esperar todas as tarefas serem completadas
   combinar todos os resultados (Join)
   }
   */
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

    System.out.println("Soma=" + result + ", tempo=" + (end - init) + "ms");
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
    result = LongStream.rangeClosed(1l, num).reduce(0L, Long::sum);
    long end = System.currentTimeMillis();

    System.out.println("Soma=" + result + ", tempo=" + (end - init) + "ms");
  }

  public static void somaParallelRangeClosedStream(long num) {
    System.out.println("soma Parallel Range Closed Stream");
    long result = 0;
    long init = System.currentTimeMillis();
    result = LongStream.rangeClosed(1l, num).parallel().reduce(0L, Long::sum);
    long end = System.currentTimeMillis();

    System.out.println("Soma=" + result + ", tempo=" + (end - init) + "ms");
  }
}
