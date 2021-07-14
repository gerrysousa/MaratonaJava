package estudo.java.javacore._6modificadorestatico.classes;

public class Cliente {
  //1 - Bloco de inicializacao estatico eh executado quando a JVM carregar a classe (eh executado apenas uma vez)
  //2 - Alocando espaco na memoria para o objeto que sera criado
  //3 - Cada atributo de classe eh criado e inicializado com seus valores default ou valores explicitos
  //4 - Bloco de inicializacao eh executado
  //5 - O construtor eh executado

  private static int[] parcelas;

  //Esse eh o bloco inicializador, apenas entre aspas
  static {
    System.out.println("Dentro do bloco inicializador estatico");
    parcelas = new int[100];
    for (int i = 1; i <= 100; i++) {
      parcelas[i - 1] = i;
    }
  }
  {
    System.out.println("Dentro do bloco inicializador comum");
  }

  public Cliente() {
  }

  public static int[] getParcelas() {
    return parcelas;
  }

  public static void setParcelas(int[] parcelas) {
    Cliente.parcelas = parcelas;
  }
}
