package estudo.java.javacore._4sobrecargaconstrutores.test;

import estudo.java.javacore._4sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {

  public static void main(String[] args) {
    Estudante estudante = new Estudante("Estudantino", "123456", new double[]{10, 8, 6});
    estudante.imprimir();

    Estudante estudante2 = new Estudante("Jose", "654321", new double[]{7, 8, 6}, "01/01/2020");
    estudante2.imprimir();
  }
}
