package estudo.java.javacore._15exception.runtimeexception.test;

public class RuntimeExceptionTest {

  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    //int s = a/b; //lança uma ArithmeticException (runtimeexception)
    //Tratamento que deve ser feito
    if (b!=0){
      int c = a/b;
      System.out.println(c);
    }

    Object o = null;
    //System.out.println(o.toString());//lança uma NullPointerException (runtimeexception)
    if (o!=null){
      System.out.println(o.toString());
    }else {
      System.out.println("Objeto é nulo");
    }

    int[] array = new int[2];
    System.out.println(array[1]);//System.out.println(array[1]); // << esse lança um ArrayIndexOutOfBoundsException (runtimeexception)

    try{
      System.out.println("Entrou no bloco try-catch");
      System.out.println(array[2]);//System.out.println(array[1]); // << esse lança um ArrayIndexOutOfBoundsException (runtimeexception)
    }catch (RuntimeException e){
      e.printStackTrace();
    }
    System.out.println("Depois do bloco try-catch");
  }
}
