package estudo.java.javacore._20expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

  public static void main(String[] args) {
    /**
     \d - todos dos digitos
     \D - tudo que não for digitos
     \s - espaços em branco \t \n \f \r
     \S - caractere que não for branco
     \w - caractere de palavras a-z, A-Z, digitos e _
     \W - tudo que não for caractere de palavras
     [] - utilizado para procurar um range de caracteres
     ? - zero ou uma ocorrencia
     * - zero ou mais ocorrencia
     + - uma ou mais ocorrencia
     (n,n) - de n até n ocorrencia
     () - serve para agrupar uma expressao
     | - serve como 'ou' -> Ex. regex:  o(c|v)0  - vai dar match com -> ovo ou oco
     $ - sinalizar fim de linha
     . - substitui qualquer caractere  Ex. regex: 1.3 - vai dar match com -> 123, 143, 1a3, 1#3, etc

     Ex.:
     \d{2} - procura dois digitos seguidos
     \d{2,4} - procura de dois a quatro digitos seguidos  20 ou 200 ou 2020
     \d{2,} - procura mais de dois digitos seguidos
     */

    regex5();

  }

  public static void regex1(){
    String regex="aba";
    //String regex="\\W";
    String texto="#ababa135 & dfsabafs aabas ABCD1235 \r fd \n";
    //O regex não reutiliza um caractere que já foi encontrado pelo regex,
    // temos 4 aba no texto=ababadfsabafsaabas, mas o regex encontra 3,

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(texto);
    System.out.println("Texto: "+texto);
    System.out.println("Indice: 0123456789");
    System.out.println("Expressoes: "+matcher.pattern());
    System.out.println("Posiçoes encontradas");

    while (matcher.find()){
      System.out.print(matcher.start()+" ");
    }
  }

  public static void regex2(){
    String regex="[abcABC]";//[a-cA-C]=[abcABC]
    //String regex="\\W";
    String texto="#ababa135 & dfsabafs aabas ABCD1235 \r fd \n";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(texto);
    System.out.println("Texto: "+texto);
    System.out.println("Indice: 0123456789");
    System.out.println("Expressoes: "+matcher.pattern());
    System.out.println("Posiçoes encontradas");

    while (matcher.find()){
      System.out.print(matcher.start()+" ");
    }
  }

  public static void regex3(){
    //procurando numeros hexadecimais 0x100F

    String regex="0[xX]([0-9a-fA-F])+(\\s|$)";

    String texto="asdf 0X 0x10 0XF 0x00wrong fdsa 0X10f";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(texto);
    System.out.println("Texto: "+texto);
    System.out.println("Indice: 0123456789");
    System.out.println("Expressoes: "+matcher.pattern());
    System.out.println("Posiçoes encontradas");

    while (matcher.find()){
      System.out.println(matcher.start()+" "+matcher.group());
    }
  }

  public static void regex4(){
    //validando email

    String regex="([a-zA-Z0-9\\._])+@([a-zA-Z0-9])+(\\.([a-zA-Z])+)+";// ou ([\w\._])+@([\w])+(\.([a-zA-Z])+)+

    String texto="fulano@gmail.com test@hotmail.com test@mail te test@hotmail.com.br";

    System.out.println("Email valido? "+"test@hotmail.com".matches(regex));
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(texto);
    System.out.println("Texto: "+texto);
    System.out.println("Indice: 0123456789");
    System.out.println("Expressoes: "+matcher.pattern());
    System.out.println("Posiçoes encontradas");

    while (matcher.find()){
      System.out.println(matcher.start()+" "+matcher.group());
    }
  }

  public static void regex5(){
    //validando data

    String regex="\\d{2}/\\d{2}/\\d{2,4}";; //ou regex="\\d\\d/\\d\\d/\\d\\d\\d\\d";

    String texto="05/07/2020  05/2/20 5/7/2019 06/08/2021 10/08/20";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(texto);
    System.out.println("Texto: "+texto);
    System.out.println("Indice: 0123456789");
    System.out.println("Expressoes: "+matcher.pattern());
    System.out.println("Posiçoes encontradas");

    while (matcher.find()){
      System.out.println(matcher.start()+" "+matcher.group());
    }
  }
}
