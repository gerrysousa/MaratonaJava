package estudo.java.introducao.arrays;

public class Arrays1 {

  public static void main(String[] args) {
    //int idades []  = new int[3]; // Funciona da mesma forma, mas não é comum usar assim
    int [] idades = new int[3];
    idades[0]=20;
    idades[1]=15;
    idades[2]=30;

    System.out.println("Idade 1: "+idades[0]);
    System.out.println("Idade 2: "+idades[1]);
    System.out.println("Idade 3: "+idades[2]);
  }
}
