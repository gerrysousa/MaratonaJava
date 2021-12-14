package estudo.java.javacore._32lambdas.interfaces;

import estudo.java.javacore._32lambdas.classes.Carro;

@FunctionalInterface
public interface CarroPredicate {

  boolean test(Carro carro);
}
