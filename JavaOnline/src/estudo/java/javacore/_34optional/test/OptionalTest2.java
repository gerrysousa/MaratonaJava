package estudo.java.javacore._34optional.test;

import estudo.java.javacore._34optional.classes.Carro1;
import estudo.java.javacore._34optional.classes.Carro2;
import estudo.java.javacore._34optional.classes.Pessoa1;
import estudo.java.javacore._34optional.classes.Pessoa2;
import estudo.java.javacore._34optional.classes.Seguradora1;
import estudo.java.javacore._34optional.classes.Seguradora2;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTest2 {

  /***
   map() = retorna um Optional
   flatMap()= retorna o valor dentro do Optional
   */


  public static void main(String[] args) {
    Seguradora1 seguradora1 = new Seguradora1("Seguros SA");
    System.out.println(obterNomeSeguradora(seguradora1));
    System.out.println(obterNomeSeguradoraOptional(seguradora1));

    Seguradora2 seguradora2 = new Seguradora2("Segura ae");
    Carro2 carro2 = new Carro2("Fiat 147", seguradora2);
    Pessoa2 pessoa2 = new Pessoa2("Bastiao", carro2);
    System.out.println(obterNomeSeguradoraOptional2(Optional.ofNullable(pessoa2)));

    checarNomeSeguradora(seguradora1);
    checarNomeSeguradoraOptional(seguradora1);
    System.out.println("============================================");
    pessoa2.setIdade(20);
    System.out.println(obterNomeSeguradoraComIdade(pessoa2, 18));
    System.out.println("============================================");
    Map<String, String> map = new HashMap<>();
    System.out.println("A chave é: " + map.get("keyTest"));
    System.out.println("A chave é: " + Optional.ofNullable(map.get("keyTest")));
    System.out.println("============================================");
    stringToInt("A");
  }

  public static void checarNomeSeguradora(Seguradora1 seguradora) {
    if (seguradora != null && seguradora.getNome().equals("Seguros SA")) {
      System.out.println("eh a Seguros SA");
    }
  }

  public static void checarNomeSeguradoraOptional(Seguradora1 seguradora) {
//    Optional<Seguradora1> seguradora2Optional = Optional.ofNullable(seguradora);
//    seguradora2Optional.filter(seguradora1 -> seguradora1.getNome().equals("Seguros SA"))
//        .ifPresent(x -> {System.out.println("eh a segura SA");});
    Optional.ofNullable(seguradora).filter(seguradora1 -> seguradora1.getNome().equals("Seguros SA"))
        .ifPresent(x -> {
          System.out.println("eh a segura SA");
        });

  }

  public static String obterNomeSeguradoraOptional(Seguradora1 seguradora1) {
    System.out.println(Optional.ofNullable(seguradora1));
    return "";
  }

  public static String obterNomeSeguradora(Seguradora1 seguradora1) {
    String nome = "";
//    if (seguradora1.getNome()!= null){
//      nome = seguradora1.getNome();
//    }
    return nome;
  }

  public static String obterNomeSeguradoraOptional2(Optional<Pessoa2> pessoa) {
    return pessoa.flatMap(Pessoa2::getCarro2).flatMap(Carro2::getSeguradora).flatMap(Seguradora2::getNome).orElse("Não existe seguradora");
    //return "";
  }

  public static String obterNomeSeguradoraComIdade(Pessoa2 pessoa, int idadeMinima) {
    return Optional.ofNullable(pessoa)
        .filter(p -> p.getIdade() >= idadeMinima)
        .flatMap(Pessoa2::getCarro2)
        .flatMap(Carro2::getSeguradora)
        .flatMap(Seguradora2::getNome)
        .orElse("Não existe seguradora ou não atingiu idade minima");
  }

  public static Optional<Integer> stringToInt(String numero) {
    try {
      return Optional.of(Integer.parseInt(numero));
    } catch (NumberFormatException e) {
      return Optional.empty();
    }
  }
}
