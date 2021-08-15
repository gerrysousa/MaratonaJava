package estudo.java.javacore._25colecoes.test;

import estudo.java.javacore._25colecoes.classes.Celular;
import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {

  public static void main(String[] args) {
    Celular celular1 = new Celular("Moto g1", "123456");
    Celular celular2 = new Celular("Samsung s10", "123457");
    Celular celular3 = new Celular("Alcatel m10", "123458");
    List<Celular> celularList = new ArrayList<>();
    celularList.add(celular1);
    celularList.add(celular2);
    celularList.add(celular3);

    for (Celular celular : celularList){
      System.out.println(celular);
    }
    Celular celular4 = new Celular("Moto g1", "123456");
    System.out.println("Comparando obj com equals: "+celular4.equals(celular1));
    System.out.println("Verificando se o celular já existe na lista: "+celularList.contains(celular4));
  }
}
