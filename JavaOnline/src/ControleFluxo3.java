public class ControleFluxo3 {

  public static void main(String[] args) {
    //char, int, byte, short, enum, String
    byte dia = 5;

    switch (dia){
      case 1:
        System.out.println("domingo");
        break;
      case 2:
        System.out.println("segunda");
        break;
        case 3:
        System.out.println("terca");
        break;
      case 4:
        System.out.println("quarta");
        break;
      case 5:
        System.out.println("quinta");
        break;
      case 6:
        System.out.println("sexta");
        break;
      case 7:
        System.out.println("sabado");
        break;
      default:
        System.out.println("Opcao invalida!!!");
        break;
    }

    char sexo='M';

    switch (sexo){
      case 'F':
        System.out.println("Feminino");
        break;
      case 'M':
        System.out.println("Masculino");
        break;
      default:
        System.out.println("Opcao invalida!!!");
        break;
    }
  }
}
