package estudo.java.javacore._30padroesdeprojeto.test;

import estudo.java.javacore._30padroesdeprojeto.classes.AviaoSingletonEnum;

public class AviaoSingletonEnumTest {

  public static void main(String[] args) {
    AviaoSingletonEnum.agendarAssento("1A");
    AviaoSingletonEnum.agendarAssento("1A");
  }
}
