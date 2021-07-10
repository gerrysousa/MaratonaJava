package estudo.java.introducao.operadores;

public class Operadores {

  public static void main(String[] args) {
    int numero1 =10;
    int numero2 =20;
    int soma = numero1+numero2;

    System.out.println(numero1+numero2);//30
    System.out.println("A soma é: "+numero1+numero2);//A soma é: 1020  --- ter atencao nesse caso
    System.out.println("A soma é: "+(numero1+numero2));//A soma é: 30
    System.out.println(numero1+numero2+" é a soma!");//30 é a soma!
    System.out.println("A soma é: "+soma);

    System.out.println("A subtracao é: "+(numero1-numero2));//A subtracao é: -10
    System.out.println("A multiplicacao e: "+(numero1*numero2));//A multiplicacao é: 200
    System.out.println("A divisao e: "+(numero1/numero2));//A divisao é: 0   -- como estamos usando inteiros, 0.5 , depois da virgula é ignorado

    System.out.println("Se resto da divisao por 2 eh = 0 (numero é par), se resto é =1 (numero eh impar)");
    System.out.println("Resto da divisao eh: "+(21%2));
    System.out.println("Resto da divisao eh: "+(20%2));

    System.out.println("Fazendo cast de variavel");
    double numDouble = 10d;
    float numFloat = (float) numDouble;// a conversão direto assim (float numFloat = numDouble;) retorna erro
    System.out.println("numFloat convertido eh:"+numFloat);
  }
}
