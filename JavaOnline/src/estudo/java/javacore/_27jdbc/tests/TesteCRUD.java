package estudo.java.javacore._27jdbc.tests;

import estudo.java.javacore._27jdbc.classes.Comprador;
import estudo.java.javacore._27jdbc.db.CompradorDAO;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class TesteCRUD {

  private static Scanner teclado = new Scanner(System.in);

  public static void main(String[] args) {
    int op;
    while (true){
      menu();
      op = Integer.parseInt(teclado.nextLine());
      if (op == 0){
        System.out.println("Saindo do sistema!!!");
        break;
      }
      if (op == 1){
        menuComprador();
        op = Integer.parseInt(teclado.nextLine());
        CompradorCRUD.executar(op);
      }
      if (op == 2){
        menuCarro();
        op = Integer.parseInt(teclado.nextLine());
        CarroCRUD.executar(op);
      }
    }
  }

  public static void menu(){
    System.out.println("Digite a opção para começar");
    System.out.println("1- Menu comprador");
    System.out.println("2- Menu carro");
    System.out.println("0- Sair");
  }

  private static void menuComprador(){
    System.out.println("Digite a opção para começar");
    System.out.println("1- Inserir comprador");
    System.out.println("2- Atualizar comprador");
    System.out.println("3- Listar todos os compradores");
    System.out.println("4- Buscar comprador por nome");
    System.out.println("5- Deletar Comprador");
    System.out.println("6- Buscar Comprador por id");
    System.out.println("9- Voltar");
  }

  private static void menuCarro(){
    System.out.println("Digite a opção para começar");
    System.out.println("1- Inserir carro");
    System.out.println("2- Atualizar carro");
    System.out.println("3- Listar todos os carros");
    System.out.println("4- Buscar carro por nome");
    System.out.println("5- Deletar carro");
    System.out.println("9- Voltar");
  }


}
