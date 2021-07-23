package estudo.java.javacore._21resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

  public static void main(String[] args) {
    /***
     Sequencia que o bundle procura a palavra (key) nos arquivos
     Exemplo:
     Locale locale = new Locale("fr","CA"));
     ResourceBundle rb = ResourceBundle.getBundle("messages",locale);
     messages_fr_CA.properties
     messages_fr.properties
     messages_pt_BR.properties  // default do sistema linguagem e paiz
     messages_pt.properties     // default do sistema linguagem
     messages.properties

     se não encontrar a palavra lança uma exceção.

     Criar bundle pelo IntelliJ
     clicar com em src>>new>> ResourceBundle >> colocar o nome do arquivo ex.: "messages" e add as linguas ex.: pt_BR, en_US.
     Ele vai criar dois arquivos messages_pt_BR.properties e messages_en_US.properties
     * */


    System.out.println(Locale.getDefault());
    //ResourceBundle rb = ResourceBundle.getBundle("messages"); //assim ele pega a linguagem default do sistema
    ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en","US"));
    System.out.println("Messages em en US --------------");
    System.out.println(rb.getString("hello"));
    System.out.println(rb.getString("good.morning"));
    System.out.println(rb.getString("good.afternoon"));
    System.out.println(rb.getString("show"));// pegou do messages.properties pois não existia no en US

    rb = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
    System.out.println("Messages em pt BR --------------");
    System.out.println(rb.getString("hello"));
    System.out.println(rb.getString("good.morning"));
    System.out.println(rb.getString("good.afternoon"));
    System.out.println(rb.getString("show"));// não pegou do messages.properties pois foi sobrescrito no messages_pt_BR.properties


  }
}
