public class ControleFluxo4 {

  public static void main(String[] args) {
    int contador=0, contator2=12;
    while (contador <10){
      System.out.println(++contador);
      //contador++;
    }
    do {
      System.out.println("dentro do do while,executa pelo menos uma vez: "+contator2);
      contator2++;
    }while (contator2<10);

    for (int i=0;i<10;i++){
      System.out.println("Valor de i eh: "+i);
    }

  }
}
