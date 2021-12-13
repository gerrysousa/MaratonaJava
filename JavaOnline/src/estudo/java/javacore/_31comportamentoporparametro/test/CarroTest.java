package estudo.java.javacore._31comportamentoporparametro.test;

import static java.util.Arrays.asList;

import estudo.java.javacore._31comportamentoporparametro.classes.Carro;
import estudo.java.javacore._31comportamentoporparametro.interfaces.CarroPredicate;
import estudo.java.javacore._31comportamentoporparametro.predicate.CarrosCorVerdePredicate;
import estudo.java.javacore._31comportamentoporparametro.predicate.CarrosDezAnosRecentePredicate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

public class CarroTest {

  public static void main(String[] args) {
    List<Carro> carros = asList(new Carro("verde", 2015), new Carro("vermelho", 2000), new Carro("verde", 1995), new Carro("cinza", 2005));
    List<Integer> numeros = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println("Todos os carros: \n" + carros);
    System.out.println("Carros verdes: \n" + filtrarCarroVerde(carros));
    System.out.println("Carros vermelhos: \n" + filtrarCarroPorCor(carros, "vermelho"));
    System.out.println("Carros com menos de 10 anos fabricados: \n" + filtrarCarroDezAnosFabricados(carros));
    System.out.println("Carros verdes predicate: \n" + filtrarCarros(carros, new CarrosCorVerdePredicate()));
    System.out.println("Carros com menos de 10 anos fabricadospredicate: \n" + filtrarCarros(carros, new CarrosDezAnosRecentePredicate()));

    System.out.println("Carros verdes predicate 2: \n" + filtrarCarros(carros, new CarroPredicate() {
      @Override
      public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
      }
    }));

    System.out.println("Carros verdes predicate 3: \n" + filtrarGenerico(carros, new Predicate<Carro>() {
      @Override
      public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
      }
    }));

    System.out.println("Numeros pares predicate: \n" + filtrarGenerico(numeros, new Predicate<Integer>() {
      @Override
      public boolean test(Integer integer) {
        return integer % 2 ==0;
      }
    }));

  }

  public static List<Carro> filtrarCarroVerde(List<Carro> carros) {
    List<Carro> result = new ArrayList<>();
    for (Carro carro : carros) {
      if (carro.getCor().equals("verde")) {
        result.add(carro);
      }
    }
    return result;
  }

  public static List<Carro> filtrarCarroPorCor(List<Carro> carros, String cor) {
    List<Carro> result = new ArrayList<>();
    for (Carro carro : carros) {
      if (carro.getCor().equals(cor)) {
        result.add(carro);
      }
    }
    return result;
  }

  public static List<Carro> filtrarCarroDezAnosFabricados(List<Carro> carros) {
    List<Carro> result = new ArrayList<>();
    for (Carro carro : carros) {
      if (carro.getAno() > Calendar.getInstance().get(Calendar.YEAR) - 10) {
        result.add(carro);
      }
    }
    return result;
  }

  public static List<Carro> filtrarCarros(List<Carro> carros, CarroPredicate carroPredicate) {
    List<Carro> result = new ArrayList<>();
    for (Carro carro : carros) {
      if (carroPredicate.test(carro)) {
        result.add(carro);
      }
    }
    return result;
  }

  public static <T> List<T> filtrarGenerico(List<T> list, Predicate<T> predicate) {
    List<T> result = new ArrayList<>();
    for (T e : list) {
      if (predicate.test(e)) {
        result.add(e);
      }
    }
    return result;
  }
}
