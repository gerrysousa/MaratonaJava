package estudo.java.javacore._20expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

  public static void main(String[] args) {
    String regex="aba";
    String texto="ababadfsabafsaabas";
    //O regex não reutiliza uma caractere que já foi encontrado pelo regex temos 4 aba no texto,
    // mas o regex encontra 3,

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
}
