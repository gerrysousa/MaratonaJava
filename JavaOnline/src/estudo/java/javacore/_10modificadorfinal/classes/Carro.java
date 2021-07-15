package estudo.java.javacore._10modificadorfinal.classes;

public class Carro {
  public static final double VELOCIDADE_FINAL=250;// Atributos finais deve ser sempre inicializados
  public static final Comprador COMPRADOR = new Comprador();// Atributos finais deve ser sempre inicializados
  private String nome;
  private String marca;



  @Override
  public String toString() {
    return "Carro{" +
        "nome='" + nome + '\'' +
        ", marca='" + marca + '\'' +
        '}';
  }

  public final void imprime(){
    System.out.println("Metodo final não pode ser sobrescrito.");
  }

  public static Comprador getComprador() {
    return COMPRADOR;
  }

  public static double getVelocidadeFinal() {
    return VELOCIDADE_FINAL;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }
}
