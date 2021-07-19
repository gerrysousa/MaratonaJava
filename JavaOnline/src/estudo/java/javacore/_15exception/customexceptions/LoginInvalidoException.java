package estudo.java.javacore._15exception.customexceptions;

public class LoginInvalidoException extends Exception{
  public LoginInvalidoException(){
    super("Usuario ou senha inválidos");
  }

}
