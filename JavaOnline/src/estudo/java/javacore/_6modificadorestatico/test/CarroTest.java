package estudo.java.javacore._6modificadorestatico.test;

import estudo.java.javacore._6modificadorestatico.classes.Carro;

public class CarroTest {

  public static void main(String[] args) {
    Carro c1 = new Carro("Porshe", 280);
    Carro c2 = new Carro("Ferrari", 290);
    Carro c3 = new Carro("Mercedes", 270);

    c1.imprime();
    c2.imprime();
    c3.imprime();

    System.out.println("=============================");
    Carro.velocidadeLimite = 220;

    c1.imprime();
    c2.imprime();
    c3.imprime();
  }
}
