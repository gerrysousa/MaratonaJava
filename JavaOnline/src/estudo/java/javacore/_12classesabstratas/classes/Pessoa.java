package estudo.java.javacore._12classesabstratas.classes;

public abstract class Pessoa {
  protected String nome;

  public abstract void metodoAbstrat01();

  public abstract void metodoAbstrat02();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
