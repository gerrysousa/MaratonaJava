package estudo.java.javacore._2introducaometodos.test;

import estudo.java.javacore._2introducaometodos.classes.Estudante;

public class EstudanteTest {

  public static void main(String[] args) {
    Estudante estudante = new Estudante();
    estudante.setNome("Joao");
    estudante.setIdade(15);
    estudante.setNotas(new double[]{6,7,9});

    estudante.print();
    estudante.recuperarMedia();
    System.out.println("Aprovado? "+estudante.isAprovado());
  }
}
