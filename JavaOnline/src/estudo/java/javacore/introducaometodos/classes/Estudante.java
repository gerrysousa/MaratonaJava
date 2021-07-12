package estudo.java.javacore.introducaometodos.classes;

public class Estudante {

  public String nome;
  public int idade;
  public double[] notas;


  public void print() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);
    if (notas != null) {
      for (double nota : notas) {
        System.out.print(nota + "; ");
      }
    }
  }

  public void recuperarMedia() {
    if (notas == null) {
      System.out.println("Aluno não possui notas!");
      return;
    }
    double media = 0;
    for (double nota : notas) {
      media += nota;
    }
    media = media / notas.length;

    if (media > 6) {
      System.out.println("\nA media foi: " + media + ", situacao: Aprovado.");
    } else {
      System.out.println("\nA media foi: " + media + ", situacao: Reprovado.");
    }

  }
}