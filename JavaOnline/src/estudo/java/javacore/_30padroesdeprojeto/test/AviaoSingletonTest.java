package estudo.java.javacore._30padroesdeprojeto.test;

import estudo.java.javacore._30padroesdeprojeto.classes.Aviao;
import estudo.java.javacore._30padroesdeprojeto.classes.AviaoSingleton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AviaoSingletonTest {

  public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
    agendarAssento("1A");
    agendarAssento("1A");

    AviaoSingleton as1 = AviaoSingleton.getInstance();
    AviaoSingleton as2 = null;

    Constructor[] constructors = AviaoSingleton.class.getDeclaredConstructors();
    for (Constructor constructor : constructors) {
      constructor.setAccessible(true);
      as2 = (AviaoSingleton) constructor.newInstance();
      break;
    }

    System.out.println(as1.hashCode());
    System.out.println(as2.hashCode());
  }

  private static void agendarAssento(String assento) {
    AviaoSingleton a = AviaoSingleton.getInstance();
    System.out.println(a.bookAssento(assento));
  }
}
