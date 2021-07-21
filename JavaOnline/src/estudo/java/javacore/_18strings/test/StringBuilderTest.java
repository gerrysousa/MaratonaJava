package estudo.java.javacore._18strings.test;

public class StringBuilderTest {

  public static void main(String[] args) {
    String s = "Uma frase comum";
    StringBuilder sb = new StringBuilder(16);

    System.out.println("append1: "+sb.append(s));
    System.out.println("append2: "+sb.append("0123456789"));
    System.out.println("reverse1: "+sb.reverse());
    System.out.println("reverse2: "+sb.reverse());
    System.out.println("delete: "+sb.delete(0,15));
    System.out.println("insert: "+sb.insert(5,"##"));

    String nova = sb.toString();
    System.out.println("Pegando o StringBuilder em uma String: "+nova);
  }
}
