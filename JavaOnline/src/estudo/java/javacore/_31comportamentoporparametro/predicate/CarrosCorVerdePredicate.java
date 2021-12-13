package estudo.java.javacore._31comportamentoporparametro.predicate;

import estudo.java.javacore._31comportamentoporparametro.classes.Carro;
import estudo.java.javacore._31comportamentoporparametro.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {

  @Override
  public boolean test(Carro carro) {
    return carro.getCor().equals("verde");
  }
}
