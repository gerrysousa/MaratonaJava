package estudo.java.javacore._1introducaoclasses.test;


import estudo.java.javacore._1introducaoclasses.classes.Carro;

public class CarroTest {

  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.modelo="Fusca";
    carro.placa="AAA1234";
    carro.velocidadeMax=120f;

    System.out.println("Modelo: "+carro.modelo);
    System.out.println("Placa: "+carro.placa);
    System.out.println("Velocidade max.: "+carro.velocidadeMax);
  }

}
