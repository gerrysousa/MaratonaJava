public class OperadoresLogicos {

  public static void main(String[] args) {
    int idade = 18;
    boolean possuiCNH = false;

    System.out.println("Operador &&: Pode dirigir? "+(idade>=18 && possuiCNH==true));

    System.out.println("Operador ||: Pode dirigir? "+(idade>=18 || possuiCNH==true));
  }
}
