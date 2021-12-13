package estudo.java.javacore._30padroesdeprojeto.test;

import estudo.java.javacore._30padroesdeprojeto.classes.Moeda;
import estudo.java.javacore._30padroesdeprojeto.classes.MoedaFactory;
import estudo.java.javacore._30padroesdeprojeto.classes.Pais;

public class MoedaFactoryTest {

  public static void main(String[] args) {
    Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
    System.out.println(moeda.getSimbolo());

    Moeda moeda2 = MoedaFactory.criarMoeda(Pais.EUA);
    System.out.println(moeda2.getSimbolo());
  }
}
