package estudo.java.introducao.operadores;

public class OperadoresDeComparacao {

  public static void main(String[] args) {
    boolean dezMaiorQueVinte = 10 >=20;
    System.out.println("Variavel dezMaiorQueVinte= "+dezMaiorQueVinte);
    boolean dezMenorIgualVinte = 10 <=20;
    System.out.println("Variavel dezMenorIgualVinte= "+dezMenorIgualVinte);

    System.out.println("Comparador 'igual' (5==5):"+(5==5));
    System.out.println("Comparador 'diferente' (5!=5):"+(5!=5));
    System.out.println("Comparador 'maior' (5>5):"+(5>5));
    System.out.println("Comparador 'menor' (5<5):"+(5<5));
    System.out.println("Comparador 'maior igual' (5>=5):"+(5>=5));
    System.out.println("Comparador 'menor igual' (5<=5):"+(5<=5));
  }
}
