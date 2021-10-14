package estudo.java.javacore._27jdbc.db;

import estudo.java.javacore._27jdbc.classes.Comprador;
import estudo.java.javacore._27jdbc.conn.ConexaoFactory;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CompradorDB {

  public static void save(Comprador comprador) {
    String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getNome() + "');";
    Connection conn = ConexaoFactory.getConexao();
    try {
      Statement stmt = conn.createStatement();
      stmt.executeUpdate(sql);
      System.out.println("Registro criado com sucesso!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void delete(Comprador comprador) {
    if (comprador == null || comprador.getId() == null) {
      System.out.println("Não foi possivel excluir o registro!");
      return;
    }
    String sql = "DELETE FROM `agencia`.`comprador` WHERE id='" + comprador.getId() + "'";
    Connection conn = ConexaoFactory.getConexao();
    try {
      Statement stmt = conn.createStatement();
      stmt.executeUpdate(sql);
      System.out.println("Registro excluído com sucesso!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void update(Comprador comprador) {
    if (comprador == null || comprador.getId() == null) {
      System.out.println("Não foi possivel atualizar o registro!");
      return;
    }
    String sql = "UPDATE `agencia`.`comprador` SET cpf='" + comprador.getCpf() + "', nome='" + comprador.getNome() + "' WHERE id='" + comprador.getId() + "'";
    Connection conn = ConexaoFactory.getConexao();
    try {
      Statement stmt = conn.createStatement();
      stmt.executeUpdate(sql);
      System.out.println("Registro atualizado com sucesso!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static List<Comprador> selectAll() {
    String sql = "SELECT id, nome, cpf FROM `agencia`.`comprador`";
    Connection conn = ConexaoFactory.getConexao();
    List<Comprador> compradorList = new ArrayList<>();
    try {
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
//       System.out.println(rs.getInt(1));
//       System.out.println(rs.getString("nome"));
//       System.out.println(rs.getString(3));
        compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
      }
      ConexaoFactory.close(conn, stmt, rs);
      return compradorList;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static List<Comprador> searchByName(String nome) {
    String sql = "SELECT id, nome, cpf FROM `agencia`.`comprador` WHERE nome LIKE '%" + nome + "%'";
    Connection conn = ConexaoFactory.getConexao();
    List<Comprador> compradorList = new ArrayList<>();
    try {
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
        compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
      }
      ConexaoFactory.close(conn, stmt, rs);
      return compradorList;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void selectMetaData() {
    String sql = "SELECT id, nome, cpf FROM `agencia`.`comprador`";
    Connection conn = ConexaoFactory.getConexao();
    List<Comprador> compradorList = new ArrayList<>();
    try {
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      ResultSetMetaData rsmd = rs.getMetaData();
      rs.next();

      int qtdColunas = rsmd.getColumnCount();
      System.out.println("Quantidade Colunas: " + qtdColunas);

      for (int i = 1; i < qtdColunas; i++) {
        System.out.println("Tabela: " + rsmd.getTableName(i));
        System.out.println("Nome coluna: " + rsmd.getColumnName(i));
        System.out.println("Tamanho coluna: " + rsmd.getColumnDisplaySize(i));
      }

      ConexaoFactory.close(conn, stmt, rs);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void checkDriverStatus() {
    Connection conn = ConexaoFactory.getConexao();
    try {
      DatabaseMetaData dbmd = conn.getMetaData();
      if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
        System.out.println("Suporta TYPE_FORWARD_ONLY. ");
        System.out.println("Leitura da tabela top-down, sempre para frente. ");
        if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
          System.out.println("E também suporta CONCUR_UPDATABLE.");
          System.out.println("CONCUR_UPDATABLE: suporta atualização do ResultSet enquando o registro está aberto. ");
        }
      }
      if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
        System.out.println("Suporta TYPE_SCROLL_INSENSITIVE. ");
        System.out.println("Leitura da tabela em qualquer posição, Alterações feitas na base não vão modificar o ResultSet pq ele fica na memória");
        if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
          System.out.println("E também suporta CONCUR_UPDATABLE");
        }
      }
      if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
        System.out.println("Suporta TYPE_SCROLL_SENSITIVE. ");
        System.out.println("Leitura da tabela em qualquer posição, Alterações feitas na base vão modificar o ResultSet. ");
        if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
          System.out.println("E também suporta CONCUR_UPDATABLE.");
        }
      }
      ConexaoFactory.close(conn);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void testTypeScroll() {
    String sql = "SELECT id, nome, cpf FROM `agencia`.`comprador`";
    Connection conn = ConexaoFactory.getConexao();
    List<Comprador> compradorList = new ArrayList<>();
    try {
      Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
      ResultSet rs = stmt.executeQuery(sql);
      if (rs.last()){
        System.out.println("Ultima linha: "+new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
        System.out.println("Numero ultima linha: "+rs.getRow());
      }
      System.out.println("retornou para a primeira linha: "+rs.first());
      System.out.println("Primeira linha: "+rs.getRow());
      rs.absolute(4);
      System.out.println("Linha 4: "+new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
      rs.relative(-1);
      System.out.println("Linha 3: "+new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
      System.out.println("Estou na ultima linha: "+rs.isLast());
      System.out.println("Estou na primeira linha: "+rs.isFirst());
      System.out.println("---------------Leitura de tras para frente---------------------");
      rs.afterLast();
      while (rs.previous()) {
        System.out.println(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
      }
      ConexaoFactory.close(conn, stmt, rs);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
