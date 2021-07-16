package estudo.java.javacore._12classesabstratas.test;

import estudo.java.javacore._12classesabstratas.classes.Gerente;
import estudo.java.javacore._12classesabstratas.classes.Vendedor;

public class FuncionarioTest {

  public static void main(String[] args) {
    Gerente g1 = new Gerente("Bastiao", "1231-1", 3000);
    Vendedor v1 = new Vendedor("Ze", "2231-1", 3000, 2000);

    g1.calculaSalario();
    v1.calculaSalario();

    System.out.println(g1);
    System.out.println("---------------------------------------");
    System.out.println(v1);
  }
}
