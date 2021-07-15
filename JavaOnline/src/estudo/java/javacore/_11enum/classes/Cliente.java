package estudo.java.javacore._11enum.classes;

public class Cliente {
  public enum TipoPagamento {
    AVISTA, APRAZO
  }

  private String nome;
  private TipoCliente tipoCliente;
  private TipoPagamento tipoPagamento;

  public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
    this.nome = nome;
    this.tipoCliente = tipoCliente;
    this.tipoPagamento = tipoPagamento;
  }

  @Override
  public String toString() {
    return "Cliente{" +
        "nome='" + nome + '\'' +
        ", tipoCliente=" + tipoCliente +
        ", tipoPagamento=" + tipoPagamento +
        ", tipoClienteInteiro=" + tipoCliente.getTipoInt() +
        ", tipoClienteNome=" + tipoCliente.getNome() +
        '}';
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public TipoCliente getTipoCliente() {
    return tipoCliente;
  }

  public void setTipoCliente(TipoCliente tipoCliente) {
    this.tipoCliente = tipoCliente;
  }
}
