package estudo.java.javacore.introducaometodos.classes;

public class Professor {
  public String nome;
  public String matricula;
  public String rg;
  public String cpf;

  public void imprimeProfessor(Professor prof)
  {
    System.out.println("------------------");
    System.out.println(prof.nome);
    System.out.println(prof.matricula);
    System.out.println(prof.rg);
    System.out.println(prof.cpf);
  }

}
