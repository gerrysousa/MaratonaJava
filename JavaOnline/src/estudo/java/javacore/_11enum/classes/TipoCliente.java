package estudo.java.javacore._11enum.classes;

public enum TipoCliente {
  PESSOA_FISICA(1,"Pessoa fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica");

  private int tipoInt;
  private String nome;

  TipoCliente(int tipoInt, String nome) {
    this.tipoInt = tipoInt;
    this.nome=nome;
  }

  public String getNome() {
    return nome;
  }

  public int getTipoInt() {
    return tipoInt;
  }
}
