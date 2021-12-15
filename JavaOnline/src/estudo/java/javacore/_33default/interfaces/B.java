package estudo.java.javacore._33default.interfaces;

public interface B extends A{

  default void oi() {
    System.out.println("Dentro do oi de B");
  }
}
