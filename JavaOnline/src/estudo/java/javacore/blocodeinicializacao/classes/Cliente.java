package estudo.java.javacore.blocodeinicializacao.classes;

public class Cliente {
  //1 - Alocando espaco na memoria para o objeto que sera criado
  //2 - Cada atributo de classe eh criado e inicializado com seus valores default ou valores explicitos
  //3 - Bloco de inicializacao eh executado
  //4 - O construtor eh executado

  private int[] parcelas;

  //Esse eh o bloco inicializador, apenas entre aspas
  {
    parcelas = new int[100];
    System.out.println("Dentro do bloco inicializador");
    for (int i = 1; i <= 100; i++) {
      parcelas[i - 1] = i;
    }
  }

  public Cliente() {
  }

  public int[] getParcelas() {
    return parcelas;
  }

  public void setParcelas(int[] parcelas) {
    this.parcelas = parcelas;
  }
}
