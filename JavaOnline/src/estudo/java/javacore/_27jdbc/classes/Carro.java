package estudo.java.javacore._27jdbc.classes;

import java.util.Objects;

public class Carro {

  private Integer id;
  private String nome;
  private String placa;
  private Comprador compradorId;

  public Carro() {
  }

  public Carro(Integer id, String nome, String placa, Comprador compradorId) {
    this.id = id;
    this.nome = nome;
    this.placa = placa;
    this.compradorId = compradorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carro carro = (Carro) o;
    return Objects.equals(id, carro.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public Comprador getCompradorId() {
    return compradorId;
  }

  public void setCompradorId(Comprador compradorId) {
    this.compradorId = compradorId;
  }
}
