package estudo.java.introducao.controlefluxo;

public class ControleFluxo5 {

  public static void main(String[] args) {
    //Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
    //Porem as parcelas não podem ser menores que 1000

    double valorTotal = 30000;

    for (int parcela = 1; parcela <=valorTotal; parcela++){
      double valorParcela = valorTotal /parcela;
      if (valorParcela<1000){
        break;
      }
      System.out.println("Pode ser dividido em "+parcela+" parcelas de R$ "+valorParcela);
    }
  }
}
