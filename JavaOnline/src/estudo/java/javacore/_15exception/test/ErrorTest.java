package estudo.java.javacore._15exception.test;

public class ErrorTest {

  public static void main(String[] args) {
    stackOverflowError();
  }

  public static void stackOverflowError(){
    stackOverflowError();
  }
}
