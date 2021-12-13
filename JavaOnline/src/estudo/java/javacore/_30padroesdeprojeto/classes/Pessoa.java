package estudo.java.javacore._30padroesdeprojeto.classes;

public class Pessoa {
  private String nome;
  private String nomeDoMeio;
  private String ultimoNome;
  private String apelido;

  private Pessoa(String nome, String nomeDoMeio, String ultimoNome, String apelido) {
    this.nome = nome;
    this.nomeDoMeio = nomeDoMeio;
    this.ultimoNome = ultimoNome;
    this.apelido = apelido;
  }

  public Pessoa() {
  }

  public static class PessoaBuilder{
    private String nome;
    private String nomeDoMeio;
    private String ultimoNome;
    private String apelido;

    public PessoaBuilder(String nome) {
      this.nome = nome;
    }

    public PessoaBuilder nome(String nome) {
      this.nome = nome;
      return this;
    }

    public PessoaBuilder nomeDoMeio(String nomeDoMeio) {
      this.nomeDoMeio = nomeDoMeio;
      return this;
    }

    public PessoaBuilder ultimoNome(String ultimoNome) {
      this.ultimoNome = ultimoNome;
      return this;
    }

    public PessoaBuilder apelido(String apelido) {
      this.apelido = apelido;
      return this;
    }

    public Pessoa build() {
      return new Pessoa( nome,  nomeDoMeio,  ultimoNome, apelido);
    }
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNomeDoMeio() {
    return nomeDoMeio;
  }

  public void setNomeDoMeio(String nomeDoMeio) {
    this.nomeDoMeio = nomeDoMeio;
  }

  public String getUltimoNome() {
    return ultimoNome;
  }

  public void setUltimoNome(String ultimoNome) {
    this.ultimoNome = ultimoNome;
  }

  public String getApelido() {
    return apelido;
  }

  public void setApelido(String apelido) {
    this.apelido = apelido;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
        "nome='" + nome + '\'' +
        ", nomeDoMeio='" + nomeDoMeio + '\'' +
        ", ultimoNome='" + ultimoNome + '\'' +
        ", apelido='" + apelido + '\'' +
        '}';
  }
}
