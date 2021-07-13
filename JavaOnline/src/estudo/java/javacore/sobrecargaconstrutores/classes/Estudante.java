package estudo.java.javacore.sobrecargaconstrutores.classes;

public class Estudante {
  private String nome;
  private String matricula;
  private double[] notas;
  private String dataMatricula;


  public Estudante(){}

  public Estudante(String nome,String matricula, double[] notas){
    this.nome=nome;
    this.matricula=matricula;
    this.notas=notas;
  }

  public Estudante(String nome,String matricula, double[] notas, String dataMatricula){
    /*
    - Um contrutor so pode ser chamado por outro constutor e não de metodos. "this(nome, matricula, notas);"
    - Deve ser sempre a primeira linha
     */
    this(nome, matricula, notas);
    this.dataMatricula=dataMatricula;
  }

  public void imprimir() {
    System.out.println("--------");
    System.out.println("Nome: "+nome);
    System.out.println("Mat.: "+matricula);
    System.out.println("Data mat.: "+dataMatricula);
    System.out.println("Notas: ");
    for (double nota : notas)
    {
      System.out.println(nota+"; ");
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public double[] getNotas() {
    return notas;
  }

  public void setNotas(double[] notas) {
    this.notas = notas;
  }

  public String getDataMatricula() {
    return dataMatricula;
  }

  public void setDataMatricula(String dataMatricula) {
    this.dataMatricula = dataMatricula;
  }
}
