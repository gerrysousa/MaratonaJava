public class ExercicioControleFluxo3 {

  public static void main(String[] args) {
    //Imprima todos os numeros pares de 0 ate 100.000
    int valor = 50;

    System.out.println("Numeros pares!");
    for (int i=0;i<valor;i++){
      if (i%2==0){
        System.out.println(i);
      }
    }
    System.out.println("Numeros impares!");
    for (int i=0;i<valor;i++){
      if (i%2!=0){
        System.out.println(i);
      }
    }
  }
}
