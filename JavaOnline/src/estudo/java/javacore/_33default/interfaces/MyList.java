package estudo.java.javacore._33default.interfaces;

public interface MyList {

  static void sort() {
    System.out.println("Dentro do sort de MyList");
    System.out.println("A partir do Java 8 é possivel colocar metodos staticos em interfaces");
  }

  void add();

  default void remove(){
    System.out.println("Para manter a retro compatibilidade, o <default> foi criado, e não é obrigatório implementar esses metodos");
  }
}
