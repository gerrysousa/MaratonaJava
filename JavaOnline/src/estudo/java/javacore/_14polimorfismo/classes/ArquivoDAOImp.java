package estudo.java.javacore._14polimorfismo.classes;

public class ArquivoDAOImp implements GenericDAO{

  @Override
  public void save() {
    System.out.println("Salvando dados no arquivo");
  }
}
