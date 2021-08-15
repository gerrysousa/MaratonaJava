package estudo.java.javacore._25colecoes.classes;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
  private String serialNumber;
  private String nome;
  private double preço;

  public Produto(String serialNumber, String nome, double preço) {
    this.serialNumber = serialNumber;
    this.nome = nome;
    this.preço = preço;
  }

  @Override
  public String toString() {
    return "Produto{" +
        "serialNumber='" + serialNumber + '\'' +
        ", nome='" + nome + '\'' +
        ", preço=" + preço +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Produto produto = (Produto) o;
    return Objects.equals(serialNumber, produto.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber);
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreço() {
    return preço;
  }

  public void setPreço(double preço) {
    this.preço = preço;
  }

  @Override
  public int compareTo(Produto outroObjeto) {
    /***
     retorna negativo se thisObjeto < outroObjeto
     retorna positivo se thisObjeto > outroObjeto
     retorna zero se thisObjeto == outroObjeto

     Tipos primitivos não tem metodos compareTo, então o tipo double do preço deve ser alterado para Double para utilizar o compareTo
     */
    Double doubleUmboxing = preço;
    return doubleUmboxing.compareTo(outroObjeto.getPreço());// ordenando pelo preço
    //return this.nome.compareTo(outroObjeto.getNome());// ordenando pelo nome
    //return this.serialNumber.compareTo(outroObjeto.getSerialNumber());// ordenando pelo serialNumber
  }
}
