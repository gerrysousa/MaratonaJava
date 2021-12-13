package estudo.java.javacore._30padroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {

  private Set<String> assentosDisponiveis;

  /**
   //EAGER INITIALIZATION = instancia já é inicializada com o programa;

   private static final AviaoSingleton INSTANCE = new AviaoSingleton();
   public static AviaoSingleton getInstance() { return INSTANCE; }
   **/

  //LAZY INITIALIZATION = Só cria a instancia quando for utilizar
  private static AviaoSingleton INSTANCE;

  public static AviaoSingleton getInstance() {
    if (INSTANCE == null) {
      synchronized (AviaoSingleton.class) {
        if (INSTANCE == null) {
          INSTANCE = new AviaoSingleton();
        }
      }
    }
    return INSTANCE;
  }

  public AviaoSingleton() {
    this.assentosDisponiveis = new HashSet<>();
    assentosDisponiveis.add("1A");
    assentosDisponiveis.add("1B");
  }


  public boolean bookAssento(String assento) {
    return assentosDisponiveis.remove(assento);
  }
}
