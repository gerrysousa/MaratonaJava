package estudo.java.javacore._26Generics.tests;

public class ClassesLocaisTest {

  private String nome = "Bastião";

  public void fazAlgumaCoisa() {
    class Interna {

      public void imprimeNomeExterno() {
        System.out.println(nome);
      }
    }
    Interna in = new Interna();
    in.imprimeNomeExterno();
  }

  public void fazAlgumaCoisa2() {
    /*** no Java 7 eu teria que coloca "final" antes do atributo sobrenome,
     no java 8 não precisa, mas o atributo é final mesmo assim
     sobrenome = "novo"; //não posso mudar um atributo final

     Para as classes dentro de um metodo vc pode utilizar public class ou abstract class
     Para as classes dentro de outra classe vc pode utilizar public,abstract,private,static,strictfp class
     */
    String sobrenome = "das Couves";
    class Interna {

      public void imprimeNomeExterno() {
        System.out.println(nome);
        System.out.println(sobrenome);
      }
    }
    Interna in = new Interna();
    in.imprimeNomeExterno();
  }

  public static void main(String[] args) {
    ClassesLocaisTest externa = new ClassesLocaisTest();
    externa.fazAlgumaCoisa();
    externa.fazAlgumaCoisa2();
  }
}
