public class Arrays3 {
  public static void main(String[] args) {
    //Formas de iniciar um array
    int numeros []  = new int[5];
    int [] numeros2 = new int[3];
    int [] numeros3 = {1,2,3,4,5};
    int [] numeros4 = new int[]{1,2,3,4,5};

    for (int i=0;i<numeros3.length;i++){
      System.out.println("Numero: "+numeros3[i]);
    }

    for (int aux : numeros4){
      System.out.println("For each _ Numero: "+aux);
    }
  }
}
