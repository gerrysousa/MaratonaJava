package estudo.java.javacore._32lambdas.test;

import estudo.java.javacore._31comportamentoporparametro.classes.Carro;
import estudo.java.javacore._31comportamentoporparametro.interfaces.CarroPredicate;
import java.sql.SQLOutput;

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
    //CarroPredicate carroPredicate2 = (Carro carro) -> { return carro.getCor().equals("verde");}; // se usar o return deve-se colocar as chaves {}

    Runnable runnable = () -> System.out.println("Dentro do run");
    new Thread(runnable).start(); //ou apenas runnable.run();


  }
}
