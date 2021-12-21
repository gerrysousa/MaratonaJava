package estudo.java.javacore._35streams.test;

import estudo.java.javacore._35streams.classes.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StremTest {

  /***
   - Pegar os tres primeiros nomes das pessoas com menos de 25 anos
   - Ordenados pelo nome
   --------------------------------------------------------------
   Stream é em tempo real
   Collections estão guardados em algum lugar
   --------------------------------------------------------------
   No Stream a dois tipos de metodos (Intermediate  e Terminal)
   Tipos intermediarios(Intermediate) retorna um outro STREAM, e permite vc encadear outros metodos
   Exemplos intermediate: stream, filter, sorted, limit, map, distinct

   Tipos finais(Terminal) retorna um valor que NÃO EH UM STREAM, por exemplo uma lista, retornar void, um valor numerico, ou uma String
   Exemplos Terminal: collect, count, forEach

   Os metodos intermediate não vão fazer nenhum processamento enquanto não tiver um metodo terminal invocando o metodo (encadiamento tipo lazy)
   */
  public static void main(String[] args) {
    List<Pessoa> pessoas = Pessoa.bancoDePessoas();
    System.out.println(get3PessoasOld(pessoas));
    System.out.println(get3PessoasStream(pessoas));

    System.out.println("Pessoas com menos de 25 anos:" + contarPessoas(pessoas));
    System.out.println("Pessoas com menos de 25 anos distintas:" + contarPessoasDistintas(pessoas));

    pessoas.stream().forEach(System.out::println);
  }

  public static List<String> get3PessoasOld(List<Pessoa> pessoaList) {
    Collections.sort(pessoaList, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));
    List<String> nomes = new ArrayList<>();
    for (Pessoa pessoa : pessoaList) {
      if (pessoa.getIdade() < 25) {
        nomes.add(pessoa.getNome());
        if (nomes.size() >= 3) {
          break;
        }
      }
    }
    return nomes;
  }

  public static List<String> get3PessoasStream(List<Pessoa> pessoaList) {
    List<String> nomes = pessoaList.stream()
        .filter(pessoa -> pessoa.getIdade() < 25)
        .sorted(Comparator.comparing(Pessoa::getNome))
        .limit(3)
        .map(Pessoa::getNome)
        .collect(Collectors.toList());
    return nomes;
  }

  public static long contarPessoas(List<Pessoa> pessoaList) {
    return pessoaList.stream()
        .filter(pessoa -> pessoa.getIdade() < 25)
        .map(Pessoa::getNome)
        .count();
  }

  public static long contarPessoasDistintas(List<Pessoa> pessoaList) {
    return pessoaList.stream()
        .filter(pessoa -> pessoa.getIdade() < 25)
        .map(Pessoa::getNome)
        .distinct()
        .count();
  }
}
