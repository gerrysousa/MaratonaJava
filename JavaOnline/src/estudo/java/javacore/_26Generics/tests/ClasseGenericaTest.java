package estudo.java.javacore._26Generics.tests;

import estudo.java.javacore._26Generics.classes.Carro;
import estudo.java.javacore._26Generics.classes.Computador;
import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {

  public static void main(String[] args) {
    List<Carro> carrosDisponiveis = new ArrayList<>();
    carrosDisponiveis.add(new Carro("Gol"));
    carrosDisponiveis.add(new Carro("BMW"));
    ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
    Carro carro = carroAlugavel.getObjetosDisponiveis();
    System.out.println("Usando carro por um mês");
    carroAlugavel.devolverObjeto(carro);
    System.out.println("-----------------------------------");

    List<Computador> computadoresDisponiveis = new ArrayList<>();
    computadoresDisponiveis.add(new Computador("DELL"));
    computadoresDisponiveis.add(new Computador("Lenovo"));
    ObjetosAlugaveis<Computador> computadorAlugavel = new ObjetosAlugaveis<>(computadoresDisponiveis);
    Computador computador = computadorAlugavel.getObjetosDisponiveis();
    System.out.println("Usando Computador por um mês");
    computadorAlugavel.devolverObjeto(computador);
  }
}

class ObjetosAlugaveis<T> {
//T = Type
  private List<T> objetosDisponiveis = new ArrayList<>();

  public ObjetosAlugaveis(List<T> objetosDisponiveis){
    this.objetosDisponiveis = objetosDisponiveis;
  }

  //Alugar
  public T getObjetosDisponiveis() {
    T c = objetosDisponiveis.remove(0);
    System.out.println("Alugando objeto: " + c);
    System.out.println("Objetos disponiveis: " + objetosDisponiveis);
    return c;
  }

  public void devolverObjeto(T c) {
    System.out.println("Devolvendo objeto: " + c);
    objetosDisponiveis.add(c);
    System.out.println("Objeto disponiveis: " + objetosDisponiveis);
  }
}

class DoisAtributos <T, X>{
  T um;
  X dois;

  public DoisAtributos(T um, X dois) {
    this.um = um;
    this.dois = dois;
  }

  public T getUm() {
    return um;
  }

  public void setUm(T um) {
    this.um = um;
  }

  public X getDois() {
    return dois;
  }

  public void setDois(X dois) {
    this.dois = dois;
  }
}