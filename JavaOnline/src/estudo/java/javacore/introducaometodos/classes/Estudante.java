package estudo.java.javacore.introducaometodos.classes;

public class Estudante {

  private String nome;
  private int idade;
  private double[] notas;
  private boolean aprovado;


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
    if (this.notas == null) {
      System.out.println("Aluno não possui notas!");
      return;
    }
    double media = 0;
    for (double nota : this.notas) {
      media += nota;
    }
    media = media / notas.length;

    if (media > 6) {
      this.aprovado=true;
      System.out.println("\nA media foi: " + media + ", situacao: Aprovado.");
    } else {
      this.aprovado=false;
      System.out.println("\nA media foi: " + media + ", situacao: Reprovado.");
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    if (idade<0){
      System.out.println("Idade não pode ser menor que 0");
      return;
    }
    this.idade = idade;
  }

  public double[] getNotas() {
    return notas;
  }

  public void setNotas(double[] notas) {
    this.notas = notas;
  }

  public boolean isAprovado() {
    return aprovado;
  }
}