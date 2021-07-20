package estudo.java.javacore._18strings.test;

public class StringTest {

  public static void main(String[] args) {
    String nome = "Ze";
    nome = nome.concat(" das couves");
    String nome2 = "Ze";// O java vai utilizar os pool de strings, e não vai criar a string Ze em memoria novamente
    System.out.println(nome);

    System.out.println("Melhor utilizar da forma do test2");
    String test1 = new String("Testes");//o JVM cria: 1- variavel de referencia; 2- um objeto do tipo string; 3- Uma string no pool de strings
    String test2 = "Testes"; //o JVM cria: 1- variavel de referencia; 2- Uma string no pool de strings
  }
}
