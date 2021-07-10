public class Arrays2 {
  public static void main(String[] args) {
    //Os arrays são inicializados ao serem criados
    //byte, short, int, long, float, double, é inicializado com => 0
    //char, é inicializado com =>  '\u0000' ' '
    //boolean, é inicializado com =>  false
    //reference (ex.: String, objeto), é inicializado com => null
    String [] nomes = new String[3];
    nomes[0]="Ze";
    nomes[1]="Bastiao";
    nomes[2]="Fulano";

    for (int i=0;i<nomes.length;i++){
      System.out.println((i+1)+" nome: "+nomes[i]);
    }
    nomes = new String[4];//Ao criar uma nova instancia o anterior é apagado

    for (int i=0;i<nomes.length;i++){
      System.out.println((i+1)+" nome: "+nomes[i]);
    }
  }
}
