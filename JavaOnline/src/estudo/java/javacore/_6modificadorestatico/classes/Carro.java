package estudo.java.javacore._6modificadorestatico.classes;

public class Carro {
  private String nome;
  private double velocidadeMax;
  private static double velocidadeLimite = 240;

  public Carro(String nome, double velocidadeMax){
    this.nome=nome;
    this.velocidadeMax=velocidadeMax;
  }

  public void imprime(){
    System.out.println("-----------------------------------");
    System.out.println("Nome: "+this.nome);
    System.out.println("Velocidade Maxima: "+this.velocidadeMax);
    System.out.println("Velocidade Limite: "+velocidadeLimite);
  }

  public Carro(){}

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getVelocidadeMax() {
    return velocidadeMax;
  }

  public void setVelocidadeMax(double velocidadeMax) {
    this.velocidadeMax = velocidadeMax;
  }

  public static double getVelocidadeLimite() {
    return velocidadeLimite;
  }

  public static void setVelocidadeLimite(double velocidadeLimite) {
    Carro.velocidadeLimite = velocidadeLimite;
  }
}
