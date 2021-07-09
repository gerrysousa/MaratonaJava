public class ControleFluxo2 {

  public static void main(String[] args) {
    //Exemplo com if ternario
    // Idade < 18 ,  Não é adulto
    // Idade >= 18 ,  É adulto
    int idade = 19;
    String status;
    boolean statusBoleano;
    //-----------------------------
//    if (idade<18){
//      status = "Não é adulto";
//    }else {
//      status = "É adulto";
//    }
    //-----------------------------
    status = idade<18 ? "Não é adulto" : "É adulto"; // essa linha corresponte ao if e else acima
    statusBoleano = idade<18 ? false : true; // essa linha corresponte ao if e else acima

    System.out.println("O status é: "+status);
    System.out.println("O statusBoleano: é adulto?  "+statusBoleano);
  }
}
