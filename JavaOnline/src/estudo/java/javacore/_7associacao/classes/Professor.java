package estudo.java.javacore._7associacao.classes;

public class Professor {
  private String nome;
  private String especialidade;
  private Seminario[] seminarios;

  public Professor(String nome, String especialidade) {
    this.nome = nome;
    this.especialidade = especialidade;
  }

  public Professor() {
  }

  public void print() {
    System.out.println("----------------- Relatorio de Professores ---------------------------");
    System.out.println("Nome: " + this.nome);
    System.out.println("Especialidade: " + this.especialidade);
    System.out.println("Seminarios participantes ");
    if (this.seminarios!=null && seminarios.length!=0) {
      for (Seminario seminario : seminarios) {
        System.out.println(seminario.getTitulo() + "; ");
      }
      return;
    }
    System.out.println("Professor não vinculado a nenhum seminario");
  }

  public Seminario[] getSeminarios() {
    return seminarios;
  }

  public void setSeminarios(Seminario[] seminarios) {
    this.seminarios = seminarios;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }
}
