package estudo.java.introducao.operadores;

public class OperadoresDeAtribuicao {

  public static void main(String[] args) {
    // = ; -= ; += ; *= ; /= ; %= ;

    int salario = 2000;
    salario += 1000;// é a mesma coisa que >>    salario = salario + 1000;
    System.out.println("O salario eh: "+salario);

    int salario2 = 1000;
    salario2 *= 0.27; //é a mesma coisa que >> salario2 =(int)(salario2 * 0.27);
    System.out.println("O desconto 27 por cento do salario eh: "+salario2);

    int salario3 = 1000;
    salario3 += (int)(salario3* 0.10); //
    System.out.println("O salario  com aumento de 10 por cento eh: "+salario3);

    int numero = 11, numero2=11;
    numero %=2;//é a mesma coisa que >> numero = numero%2;
    System.out.println("O resto da divisao 11/2 eh: "+numero);
    numero2 %=3;//é a mesma coisa que >> numero2 = numero2%3;
    System.out.println("O resto da divisao 11/3 eh: "+numero2);

  }
}
