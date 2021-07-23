package estudo.java.javacore._20expressoesregulares;

public class TokenTest {

  public static void main(String[] args) {
    String str = "Fulano, Ciclano, Deocrano, Beotrano, Tiao, Ze";
    String[]tokens = str.split(",");
    for (String arr : tokens){
      System.out.println(arr.trim());
    }
    System.out.println("--------------------------");
    String str2 = "Fulano1 Ciclano2 Deocrano3 Beotrano4 Tiao5 Ze";
    String[]tokens2 = str2.split("\\d");//utilizando digito para separar as strings
    for (String arr1 : tokens2){
      System.out.println(arr1.trim());
    }

  }
}
