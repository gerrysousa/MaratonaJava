package estudo.java.javacore._35streams.test;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.summarizingDouble;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import estudo.java.javacore._35streams.classes.Genero;
import estudo.java.javacore._35streams.classes.Maioridade;
import estudo.java.javacore._35streams.classes.Pessoa;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest6Collectors2 {

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

  //Agrupamento de elementos
  public static void main(String[] args) {
    List<Pessoa> pessoas = Pessoa.bancoDePessoas();
    Map<Genero, List<Pessoa>> generoListMap = new HashMap<>();
    List<Pessoa> masculinos = new ArrayList<>();
    List<Pessoa> femininos = new ArrayList<>();
    for (Pessoa pessoa : pessoas) {
      if (pessoa.getGenero().equals(Genero.FEMININO))
        femininos.add(pessoa);
      else
        masculinos.add(pessoa);
    }
    generoListMap.put(Genero.FEMININO, femininos);
    generoListMap.put(Genero.MASCULINO, masculinos);
    System.out.println(generoListMap);

    //Agrupamento por genero
    Map<Genero, List<Pessoa>> generoListMapCollect = pessoas.stream()
        .collect(groupingBy(Pessoa::getGenero));
    System.out.println(generoListMapCollect);

    //Agrupamento por maioridade
    Map<Maioridade, List<Pessoa>> groupByIdade = pessoas.stream()
        .collect(groupingBy(pessoa -> {
          if (pessoa.getIdade() < 18)
            return Maioridade.MENOR;
          else
            return Maioridade.ADULTO;
        }));
    System.out.println(groupByIdade);

    //Agrupamento por genero e maioridade
    Map<Genero, Map<Maioridade, List<Pessoa>>> groupByGeneroMaioridade = pessoas.stream()
        .collect(groupingBy(Pessoa::getGenero, groupingBy(pessoa -> {
          if (pessoa.getIdade() < 18)
            return Maioridade.MENOR;
          else
            return Maioridade.ADULTO;
        })));
    System.out.println(groupByGeneroMaioridade);

    //Agrupamento por genero e quantidade
    Map<Genero, Long> qtdPorGenero = pessoas.stream().collect(groupingBy(Pessoa::getGenero, counting()));
    System.out.println(qtdPorGenero);

    //Agrupamento por genero e maior salario com Optional
    Map<Genero, Optional<Pessoa>> generoMaiorSalario = pessoas.stream().collect(groupingBy(Pessoa::getGenero, maxBy(Comparator.comparing(Pessoa::getSalario))));
    System.out.println(generoMaiorSalario);

    //Agrupamento por genero e maior salario sem Optional
    Map<Genero, Pessoa> generoMaiorSalario2 = pessoas.stream()
        .collect(groupingBy(Pessoa::getGenero,
            collectingAndThen(maxBy(Comparator.comparing(Pessoa::getSalario)), Optional::get)));
    System.out.println(generoMaiorSalario2);

    //Agrupamento por genero
    Map<Genero, DoubleSummaryStatistics> porGeneroEstatisticas = pessoas.stream().collect(groupingBy(Pessoa::getGenero, summarizingDouble(Pessoa::getSalario)));
    System.out.println(porGeneroEstatisticas);

    //Agrupamento por genero e maioridade novo modo
    Map<Genero, Set<Maioridade>> groupByGeneroMaioridade2 = pessoas.stream()
        .collect(groupingBy(Pessoa::getGenero, mapping(pessoa -> {
          if (pessoa.getIdade() < 18)
            return Maioridade.MENOR;
          else
            return Maioridade.ADULTO;
        }, toSet())));
    System.out.println(groupByGeneroMaioridade2);

    Map<Genero, Set<Maioridade>> groupByGeneroMaioridade3 = pessoas.stream()
        .collect(groupingBy(Pessoa::getGenero, mapping(pessoa -> {
          if (pessoa.getIdade() < 18)
            return Maioridade.MENOR;
          else
            return Maioridade.ADULTO;
        }, toCollection(LinkedHashSet::new))));
    System.out.println(groupByGeneroMaioridade3);
  }
}
