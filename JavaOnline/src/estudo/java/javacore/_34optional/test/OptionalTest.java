package estudo.java.javacore._34optional.test;

import java.util.Optional;

public class OptionalTest {
  String nome;
  public static void main(String[] args) {
    OptionalTest ot = new OptionalTest();

    if (ot.nome!=null){
      System.out.println(ot.nome.toUpperCase());
    }

    Optional<String> optional1 = Optional.of("Bastiao");// utiliza-se quando tem-se certeza que a variavel não vai ser nula (Optional.of requer não nulo )
    Optional<String> optional2 = Optional.empty();
    Optional<String> optional3 = Optional.ofNullable(ot.nome);

    //Imprimindo
    System.out.println(optional1);
    System.out.println(optional2);
    System.out.println(optional3);

    //Buscando valores
    //System.out.println(optional1.get());//O .get() pode lançar exceção se o valor esperado é nulo
    System.out.println(optional1.orElse("vazio"));// o .orElse retorna a variavel, e ser ela for nula, retorna o valor passado no parametro "vazio"
    System.out.println(optional2.orElse("vazio"));
    System.out.println(optional3.orElse("vazio"));

  }
}
