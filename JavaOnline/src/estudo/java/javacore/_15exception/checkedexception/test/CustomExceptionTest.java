package estudo.java.javacore._15exception.checkedexception.test;

import estudo.java.javacore._15exception.customexceptions.LoginInvalidoException;

public class CustomExceptionTest {

  public static void main(String[] args) {
    try {
      logar("bastiao", "wrong");
    } catch (LoginInvalidoException e) {
      e.printStackTrace();
    }
  }

  public static void logar(String usuarioDigitado,String senhaDigitada ) throws LoginInvalidoException {
    String usuarioBanco = "bastiao";
    String senhaBanco = "123456";

    if (!usuarioDigitado.equals(usuarioBanco)||!senhaDigitada.equals(senhaBanco)) {
      throw new LoginInvalidoException();
    }else{
      System.out.println("Logado com sucesso");
    }
  }
}
