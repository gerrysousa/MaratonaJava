package estudo.java.javacore._20expressoesregulares;

import java.util.Scanner;

public class ScannerTest {

  public static void main(String[] args) {
    Scanner scanner = new Scanner("1 true 100 oi false");
    while (scanner.hasNext()){
      System.out.println(scanner.next());
    }
    System.out.println("---------------------");
    Scanner scanner2 = new Scanner("1 true 100 oi false");
    while (scanner2.hasNext()){
      if (scanner2.hasNextInt()){
        int i = scanner2.nextInt();
        System.out.println("Int: "+i);
      }
      else if(scanner2.hasNextBoolean()){
        boolean b = scanner2.nextBoolean();
        System.out.println("Boleano: "+b);
      }else {
        System.out.println(scanner2.next());
      }
    }
  }
}
