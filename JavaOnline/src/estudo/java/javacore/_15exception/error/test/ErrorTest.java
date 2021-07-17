package estudo.java.javacore._15exception.error.test;

public class ErrorTest {

  public static void main(String[] args) {
    stackOverflowError();
  }

  public static void stackOverflowError(){
    stackOverflowError();
  }
}
