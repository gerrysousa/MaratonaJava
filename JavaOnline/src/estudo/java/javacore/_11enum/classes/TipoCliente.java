package estudo.java.javacore._11enum.classes;

public enum TipoCliente {
  PESSOA_FISICA(1,"Pessoa fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica"){
    public String getId() {
      return "B";
    }
  };

  private int tipoInt;
  private String nome;

  TipoCliente(int tipoInt, String nome) {
    this.tipoInt = tipoInt;
    this.nome=nome;
  }
  //constant specific class body
  //corpo de classe especifico constante

  public String getId() {
    return "A";
  }

  public String getNome() {
    return nome;
  }

  public int getTipoInt() {
    return tipoInt;
  }
}
