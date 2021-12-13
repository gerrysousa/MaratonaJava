package estudo.java.javacore._27jdbc.tests;

import estudo.java.javacore._27jdbc.classes.Carro;
import estudo.java.javacore._27jdbc.classes.Comprador;
import estudo.java.javacore._27jdbc.db.CarroDAOImpl;
import estudo.java.javacore._27jdbc.interfaces.CarroDAO;
import java.util.List;
import java.util.Scanner;

public class CarroCRUD {

  private static Scanner teclado = new Scanner(System.in);
  private static CarroDAO dao = new CarroDAOImpl();
  //private static CarroDAO dao = new CarroDAOImplNoSql();// se quiser mudar a implementacao

  public static void executar(int op) {
    switch (op) {
      case 1:
        inserir();
        break;
      case 2:
        atualizar();
        break;
      case 3:
        listarTodos();
        break;
      case 4:
        System.out.println("Digite o nome: ");
        listarPorNome(teclado.nextLine());
        break;
      case 5:
        deletar();
        break;
      case 9:
        break;
    }
  }

  private static void inserir() {
    Carro c = new Carro();
    System.out.println("Nome: ");
    c.setNome(teclado.nextLine());
    System.out.println("Placa: ");
    c.setPlaca(teclado.nextLine());
    System.out.println("Selecione um dos compradores: ");
    List<Comprador> compradorList = CompradorCRUD.listarTodos();
    c.setCompradorId(compradorList.get(Integer.parseInt(teclado.nextLine())));
    dao.save(c);
  }

  private static void atualizar() {
    System.out.println("Selecione um dos carros abaixo:");
    List<Carro> carroList = listarTodos();
    Carro c = carroList.get(Integer.parseInt(teclado.nextLine()));
    System.out.println("Novo nome ou enter para o mesmo");
    String nome = teclado.nextLine();
    System.out.println("Nova placa ou enter para o mesmo");
    String placa = teclado.nextLine();

    if (!nome.isEmpty()) {
      c.setNome(nome);
    }
    if (!nome.isEmpty()) {
      c.setPlaca(placa);
    }
    dao.update(c);
  }

  private static List<Carro> listarTodos() {
    List<Carro> carroList = dao.selectAll();
    for (int i = 0; i < carroList.size(); i++) {
      Carro c = carroList.get(i);
      System.out.println("[" + i + "] " + c.getNome() + " " + c.getPlaca() + " " + c.getCompradorId().getNome());
    }
    return carroList;
  }

  private static List<Carro> listarPorNome(String nome) {
    List<Carro> carroList = dao.searchByName(nome);
    for (int i = 0; i < carroList.size(); i++) {
      Carro c = carroList.get(i);
      System.out.println("[" + i + "] " + c.getNome() + " " + c.getPlaca() + " " + c.getCompradorId());
    }
    return carroList;
  }

  private static void deletar() {
    System.out.println("Selecione um dos carros abaixo:");
    List<Carro> carroList = listarTodos();
    int index = Integer.parseInt(teclado.nextLine());
    System.out.println("Tem certeza? S/N");
    String op = teclado.nextLine();
    if (op.startsWith("s")) {
      dao.delete(carroList.get(index));
    }
  }
}
