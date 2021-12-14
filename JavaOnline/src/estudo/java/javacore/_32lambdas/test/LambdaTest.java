package estudo.java.javacore._32lambdas.test;

import estudo.java.javacore._31comportamentoporparametro.classes.Carro;
import estudo.java.javacore._31comportamentoporparametro.interfaces.CarroPredicate;
import java.sql.SQLOutput;
import java.util.function.Predicate;

public class LambdaTest {

  /***
    Um lambda de ser:
   - anomima
   - function
   - passada por aí
   - concisa

   - Só pode se usar as lambdas com interfaces funcionais (@FunctionalInterface)
   - Sintaxe da lambda, parametro, setinha e o corpo. <parametros> -> <corpo ou expressãp>

   Ex.: (Carro carro) -> carro.getCor.equals.("verde");
   (int a, int b) -> System.out.println("soma:"+a+b);
   (String s) -> s.length()
   () -> System.out.println("soma:"+a+b);

   ------------
   Isso é possivel por causa do target type: "Predicate<Carro> carroPredicate2" ou "CarroPredicate carroPredicate2"
   CarroPredicate carroPredicate2 = (Carro carro) -> { return carro.getCor().equals("verde");}; // se usar o return deve-se colocar as chaves {}
   ou
   Predicate<Carro> carroPredicate2 = (Carro carro) -> { return carro.getCor().equals("verde");}; // se usar o return deve-se colocar as chaves {}

   */

  public static void main(String[] args) {
    //-------------------- sem lambda ---------------------------------
    CarroPredicate carroPredicate = new CarroPredicate() {
      @Override
      public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
      }
    };
    System.out.println(carroPredicate.test(new Carro("verde", 2015)));
    //-------------------- com lambda mesmo codigo---------------------------------
    CarroPredicate carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");
    System.out.println(carroPredicate2.test(new Carro("verde", 2015)));
    //-------------------- com lambda ---------------------------------

    Runnable runnable = () -> System.out.println("Dentro do run");
    new Thread(runnable).start(); //ou apenas runnable.run();


  }
}
