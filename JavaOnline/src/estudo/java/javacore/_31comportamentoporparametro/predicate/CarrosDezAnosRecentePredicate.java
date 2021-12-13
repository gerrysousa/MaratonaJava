package estudo.java.javacore._31comportamentoporparametro.predicate;

import estudo.java.javacore._31comportamentoporparametro.classes.Carro;
import estudo.java.javacore._31comportamentoporparametro.interfaces.CarroPredicate;
import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate {

  @Override
  public boolean test(Carro carro) {
    return carro.getAno() > Calendar.getInstance().get(Calendar.YEAR) - 10;
  }
}
