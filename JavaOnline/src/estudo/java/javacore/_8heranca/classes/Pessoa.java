package estudo.java.javacore._8heranca.classes;

public class Pessoa {
  //modificador de acesso protected, permite acesso somente dentro do mesmo pacote, ou das classes filhas
  protected String nome;
  protected String cpf;
  protected Endereco endereco;

  public void print(){
    System.out.println("Nome: "+this.nome);
    System.out.println("Cpf: "+this.cpf);
    System.out.println("Endereco: "+this.endereco.getRua());
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
}
