package estudo.java.javacore._14polimorfismo.classes;

public class DatabaseDAOImp implements GenericDAO{

  @Override
  public void save() {
    System.out.println("Salvando dados no banco de dados");
  }
}
