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
     */

    regex3();

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
  public static void regex3(){
    //procurando numeros hexadecimais 0x100F

    String regex="0[xX][0-9a-fA-F]";

    String texto="asdf 0X 0x10 0XF fdsa 0X10f";
    //O regex não reutiliza um caractere que já foi encontrado pelo regex,
    // temos 4 aba no texto=ababadfsabafsaabas, mas o regex encontra 3,

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
