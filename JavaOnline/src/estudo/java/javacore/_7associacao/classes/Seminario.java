package estudo.java.javacore._7associacao.classes;

public class Seminario {

  private String titulo;
  private Aluno[] alunos;
  private Professor professor;
  private Local local;

  public Seminario(String titulo) {
    this.titulo = titulo;
  }

  public Seminario() {
  }

  public void print() {
    System.out.println("----------------- Relatorio de Seminarios ---------------------------");
    System.out.println("Titulo: " + this.titulo);
    if (this.professor != null) {
      System.out.println("Professor: " + this.professor.getNome());
    }else {
      System.out.println("Nenhum professor cadastrado");
    }

    if (this.local != null) {
      System.out.println("Local: " + this.local.getRua() + ", " + this.local.getBairro());
    } else {
      System.out.println("Sem local cadastrado");
    }
    if (this.alunos != null && alunos.length != 0) {
      System.out.println("--- Alunos Inscritos ---");
      for (Aluno aluno : alunos) {
        System.out.println(aluno.getNome() + "; ");
      }
      return;
    }
    System.out.println("Nenhum aluno cadastrado");
  }

  public Local getLocal() {
    return local;
  }

  public void setLocal(Local local) {
    this.local = local;
  }

  public Professor getProfessor() {
    return professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public Aluno[] getAlunos() {
    return alunos;
  }

  public void setAlunos(Aluno[] alunos) {
    this.alunos = alunos;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
}
