package estudo.java.javacore._16assertions.test;

public class AssertTest {

  public static void main(String[] args) {
    calculaSalario(-1000);
    //calcSalario(-1000);
    diasDaSemana(9);
  }

  private static void calculaSalario(double salario) {
//    if (salario>0){
//      System.out.println("executando medodo");
//    }else {
//      System.out.println("Salario não pode ser negativo");
//    }
    assert (salario > 0);// esse assert elimina a necessidade do if else comentato
    //assert (salario > 0):"Salario não pode ser negativo";
    System.out.println("Boa protica: o assert deveria ser usado em metodos privados");
    System.out.println("Ativar assert IntelliJ vá em: Run>>Edit Configuration>>> VM Options, e Add '-ea' para habilidar");
    System.out.println("Desativar assert IntelliJ vá em: Run>>Edit Configuration>>> VM Options, e apagar '-ea' ou add '-da'");
    System.out.println("Ativar assert para somente algumas classes '-ea:estudo.java.javacore._16assertions.test.NomeClasse'");
    System.out.println("Desativar para todas e abilitar para uma '-da -ea:estudo.java.javacore._16assertions.test.NomeClasse'");
  }

  public static void calcSalario(double salario) {
    if (salario < 0) {
      throw new IllegalArgumentException();
    }
    System.out.println("Boa protica: para metodos publicos lançar um IllegalArgumentException");
    System.out.println("Ativar assert IntelliJ vá em: Run>>Edit Configuration>>> VM Options, e Add '-ea' para habilidar");
  }
  public static void diasDaSemana(int dia) {
    System.out.println("Pode-se usar o assert em metodo publicos, quando vc tem certeza absoluta da regra e que ela não vai mudar");
    switch (dia){
      case 1: break;
      case 2: break;
      case 3: break;
      case 4: break;
      case 5: break;
      case 6: break;
      case 7: break;
      default:assert false;
    }
  }

}
