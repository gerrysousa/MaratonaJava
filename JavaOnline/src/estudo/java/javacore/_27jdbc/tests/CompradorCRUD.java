package estudo.java.javacore._27jdbc.tests;

import estudo.java.javacore._27jdbc.classes.Comprador;
import estudo.java.javacore._27jdbc.db.CompradorDAO;
import java.util.List;
import java.util.Scanner;

public class CompradorCRUD {

  private static Scanner teclado = new Scanner(System.in);

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
      case 6:
        System.out.println("Digite o id: ");
        listarPorID(Integer.parseInt(teclado.nextLine()));
        break;
      case 9:
        break;
    }
  }

  private static void inserir() {
    Comprador c = new Comprador();
    System.out.println("Nome: ");
    c.setNome(teclado.nextLine());
    System.out.println("CPF: ");
    c.setNome(teclado.nextLine());
    CompradorDAO.save(c);
  }

  private static void atualizar() {
    System.out.println("Selecione um dos compradores abaixo:");
    List<Comprador> compradorList = listarTodos();
    Comprador c = compradorList.get(Integer.parseInt(teclado.nextLine()));
    System.out.println("Novo nome ou enter para o mesmo");
    String nome = teclado.nextLine();
    System.out.println("Novo cpf ou enter para o mesmo");
    String cpf = teclado.nextLine();

    if (!nome.isEmpty()) {
      c.setNome(nome);
    }
    if (!nome.isEmpty()) {
      c.setCpf(cpf);
    }
    CompradorDAO.update(c);
  }

  public static List<Comprador> listarTodos() {
    List<Comprador> compradorList = CompradorDAO.selectAll();
    for (int i = 0; i < compradorList.size(); i++) {
      Comprador c = compradorList.get(i);
      System.out.println("[" + i + "] " + c.getNome() + " " + c.getCpf());
    }
    return compradorList;
  }

  private static List<Comprador> listarPorNome(String nome) {
    List<Comprador> compradorList = CompradorDAO.searchByName(nome);
    for (int i = 0; i < compradorList.size(); i++) {
      Comprador c = compradorList.get(i);
      System.out.println("[" + i + "] " + c.getNome() + " " + c.getCpf());
    }
    return compradorList;
  }

  private static Comprador listarPorID(Integer id) {
   Comprador c = CompradorDAO.searchById(id);

      System.out.println("[" + c.getId() + "] " + c.getNome() + " " + c.getCpf());
    return c;
  }

  private static void deletar() {
    System.out.println("Selecione um dos compradores abaixo:");
    List<Comprador> compradorList = listarTodos();
    int index = Integer.parseInt(teclado.nextLine());
    System.out.println("Tem certeza? S/N");
    String op = teclado.nextLine();
    if (op.startsWith("s")) {
      CompradorDAO.delete(compradorList.get(index));
    }
  }
}
