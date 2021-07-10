package estudo.java.introducao.controlefluxo;

public class ControleFluxo6 {
  public static void main(String[] args) {
    //Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
    //Porem as parcelas não podem ser menores que 1000

    double valorTotal = 30000;

    for (int parcela = (int)valorTotal; parcela >=1; parcela--){
      double valorParcela = valorTotal /parcela;
      if (valorParcela<=1000){
        //o continue vai voltar ao inicio do for, e ignorar o codigo abaixo dele
        continue;
      }
      System.out.println("Pode ser dividido em "+parcela+" parcelas de R$ "+valorParcela);
    }
  }
}
