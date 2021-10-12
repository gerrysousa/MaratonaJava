package estudo.java.javacore._26Generics.tests;

import estudo.java.javacore._26Generics.classes.Carro;
import estudo.java.javacore._26Generics.classes.Computador;
import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTest {

  public static void main(String[] args) {
    CarroAlugavel carroAlugavel = new CarroAlugavel();
    Carro carroAlugado = carroAlugavel.getCarroDisponivel();
    System.out.println("Usando carro por um mês");
    carroAlugavel.devolverCarro(carroAlugado);
    System.out.println("----------------------------------");
    ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
    Computador computadorAlugado = computadorAlugavel.getComputadorDisponivel();
    System.out.println("Usando Computador por um mês");
    computadorAlugavel.devolverCarro(computadorAlugado);
  }
}

class CarroAlugavel {

  private List<Carro> carrosDisponiveis = new ArrayList<>();

  {
    carrosDisponiveis.add(new Carro("Gol"));
    carrosDisponiveis.add(new Carro("BMW"));
  }

  //Alugar
  public Carro getCarroDisponivel() {
    Carro c = carrosDisponiveis.remove(0);
    System.out.println("Alugando carro: " + c);
    System.out.println("Carros disponiveis: " + carrosDisponiveis);
    return c;
  }

  public void devolverCarro(Carro c) {
    System.out.println("Devolvendo carro: " + c);
    carrosDisponiveis.add(c);
    System.out.println("Carros disponiveis: " + carrosDisponiveis);
  }
}

class ComputadorAlugavel {

  private List<Computador> computadorDisponiveis = new ArrayList<>();

  {
    computadorDisponiveis.add(new Computador("DELL"));
    computadorDisponiveis.add(new Computador("Lenovo"));
  }

  //Alugar
  public Computador getComputadorDisponivel() {
    Computador c = computadorDisponiveis.remove(0);
    System.out.println("Alugando Computador: " + c);
    System.out.println("Computador disponiveis: " + computadorDisponiveis);
    return c;
  }

  public void devolverCarro(Computador c) {
    System.out.println("Devolvendo Computador: " + c);
    computadorDisponiveis.add(c);
    System.out.println("Computador disponiveis: " + computadorDisponiveis);
  }
}