package estudo.java.javacore._27jdbc.db;

import estudo.java.javacore._27jdbc.classes.Comprador;
import estudo.java.javacore._27jdbc.conn.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CompradorDAO {

  public static void save(Comprador comprador) {
    String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES (? , ?);";
    try (Connection conn = ConexaoFactory.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql);) {
      ps.setString(1, comprador.getCpf());
      ps.setString(2, comprador.getNome());
      ps.executeUpdate(sql);
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
    String sql = "DELETE FROM `agencia`.`comprador` WHERE `id`= ?";
    try (Connection conn = ConexaoFactory.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql);) {
      ps.setInt(1, comprador.getId());
      ps.executeUpdate();
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
    String sql = "UPDATE `agencia`.`comprador` SET `cpf`= ?, `nome`= ? WHERE `id`= ?";
    try (Connection conn = ConexaoFactory.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql);) {
      ps.setString(1, comprador.getCpf());
      ps.setString(2, comprador.getNome());
      ps.setInt(3, comprador.getId());
      ps.executeUpdate();
      System.out.println("Registro atualizado com sucesso!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static List<Comprador> selectAll() {
    String sql = "SELECT id, nome, cpf FROM `agencia`.`comprador`";
    List<Comprador> compradorList = new ArrayList<>();
    try (Connection conn = ConexaoFactory.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();) {
      while (rs.next()) {
        compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
      }
      return compradorList;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static List<Comprador> searchByName(String nome) {
    String sql = "SELECT id, nome, cpf FROM `agencia`.`comprador` WHERE nome LIKE ?";
    List<Comprador> compradorList = new ArrayList<>();
    try (Connection conn = ConexaoFactory.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql);
    ) {
      ps.setString(1, "%" + nome + "%");
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
      }
      ConexaoFactory.close(conn, ps, rs);
      return compradorList;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

}
