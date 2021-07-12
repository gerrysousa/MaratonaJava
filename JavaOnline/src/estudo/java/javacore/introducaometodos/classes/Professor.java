package estudo.java.javacore.introducaometodos.classes;

public class Professor {
  public String nome;
  public String matricula;
  public String rg;
  public String cpf;

  public void imprimeProfessor()
  { // quando é tipo primitivo, o metodo recebe uma copia do valor,
    // quando é tipo reference, o metodo recebe a referencia do objeto na memoria
    //aux.nome = "Nome foi alterado";
    System.out.println("------------------");
    System.out.println(this.nome);
    System.out.println(this.matricula);
    System.out.println(this.rg);
    System.out.println(this.cpf);
  }

}
