package estudo.java.introducao.arrays;

public class Arrays6 {

  public static void main(String[] args) {
    // Inicializando array unidimencional
    int[] arrayInt = new int[3];
    int[] arrayInt2 = new int[]{1, 2, 3};
    int[] arrayInt3 = {1, 2, 3};

    // Inicializando array bidirecional
    int[][] dias = new int[3][];
    dias[0]= new int[2];
    dias[1]= new int[]{1,2,3};
    dias[2]= new int[4];

    for (int[] arr:dias){
      for (int num : arr){
        System.out.println("Dias é: "+num);
      }
    }
    // ------ outra forma de inicilizar
    int[][]dias2 = {{0,0},{1,2,3},{0,0,0,0}};

    for (int[] arr:dias2){
      for (int num : arr){
        System.out.println("Dias2 é: "+num);
      }
    }

  }
}
