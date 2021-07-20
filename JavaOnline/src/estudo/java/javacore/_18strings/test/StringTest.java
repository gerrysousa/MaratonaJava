package estudo.java.javacore._18strings.test;

public class StringTest {

  public static void main(String[] args) {
    String nome = "Ze";
    nome = nome.concat(" das couves");//ou: nome+=" das couves";
    String nome2 = "Ze";// O java vai utilizar os pool de strings, e não vai criar a string Ze em memoria novamente
    System.out.println(nome);

    System.out.println("Melhor utilizar da forma do test2");
    String test1 = new String("Testes");//o JVM cria: 1- variavel de referencia; 2- um objeto do tipo string; 3- Uma string no pool de strings
    String test2 = "Testes"; //o JVM cria: 1- variavel de referencia; 2- Uma string no pool de strings

    System.out.println("--------utils----------");
    String utils1 = "Bastiao", utils2="bastiao", utils3="  NomeComEspacosAntesEDepois ";
    System.out.println("Pegar o caractere em uma posicao: "+utils1.charAt(2));
    System.out.println("Compara string e ignora case: "+utils1.equalsIgnoreCase(utils2));
    System.out.println("Tamanho da string: "+utils1.length());
    System.out.println("Trocar partes da string: "+utils1.replace("B","Seb"));
    System.out.println("Tudo em maiusculo: "+utils1.toUpperCase());
    System.out.println("Tudo em minusculo: "+utils1.toLowerCase());
    System.out.println("Substring palavra Bastiao: pegar do caractere 2 ate o 4 -> "+utils1.substring(1,4));
    System.out.println("'"+utils3+"', e agora removendo espaços fica '"+utils3.trim()+"'");

  }
}
