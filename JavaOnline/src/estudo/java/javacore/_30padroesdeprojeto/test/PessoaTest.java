package estudo.java.javacore._30padroesdeprojeto.test;

import estudo.java.javacore._30padroesdeprojeto.classes.Pessoa;

public class PessoaTest {

  public static void main(String[] args) {
    Pessoa p = new Pessoa.PessoaBuilder("Bastiao")
        .nomeDoMeio("Juscelino")
        .ultimoNome("Florentino")
        .apelido("tiao")
        .criarPessoa();

    System.out.println(p);
  }
}
