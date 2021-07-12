package estudo.java.javacore.introducaometodos.test;

import estudo.java.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {

  public static void main(String[] args) {
    Estudante estudante = new Estudante();
    estudante.nome="joao";
    estudante.idade=15;
    estudante.notas = new double[]{6,7,9};

    estudante.print();
    estudante.recuperarMedia();
  }
}
