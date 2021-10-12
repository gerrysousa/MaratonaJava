package estudo.java.javacore._26Generics.tests;

public class ClassesExternasInternasTest {

  private String nome = "Bastião";

  class Interna {
    public void verClasseExterna(){
      System.out.println(nome);
      System.out.println("this da classe interna: "+this);
      System.out.println("this da classe externa: "+ClassesExternasInternasTest.this);
    }
  }

  public static void main(String[] args) {
    ClassesExternasInternasTest externa = new ClassesExternasInternasTest();

    System.out.println("Jeito de criar 1");
    ClassesExternasInternasTest.Interna in = externa.new Interna();
    in.verClasseExterna();

    System.out.println("Jeito de criar 2");
    ClassesExternasInternasTest.Interna in2 = new ClassesExternasInternasTest().new Interna();
    in2.verClasseExterna();
  }
}
