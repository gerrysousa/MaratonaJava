package estudo.java.javacore.introducaoclassestest;

import estudo.java.javacore.introducaoclasses.Estudante;

public class EstudanteTest {

  public static void main(String[] args) {
    Estudante joao = new Estudante();
    joao.nome="joao";
    joao.matricula="1234";
    joao.idade=15;

    System.out.println("nome: "+joao.nome);
    System.out.println("matricula: "+joao.matricula);
    System.out.println("idade: "+joao.idade);
  }
}
