package estudo.java.javacore._24serializacao.test;

import estudo.java.javacore._24serializacao.classes.Aluno;
import estudo.java.javacore._24serializacao.classes.Turma;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializacaoTest {

  public static void main(String[] args) {
    gravadorObjeto();
    leitorObjeto();
  }

  public static void gravadorObjeto() {
    Turma t = new Turma("Maratona java");
    Aluno aluno = new Aluno(1L, "Joaozinho", "123456");
    aluno.setTurma(t);
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
      oos.writeObject(aluno);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void leitorObjeto() {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
      Aluno aluno = (Aluno) ois.readObject();
      System.out.println(aluno);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
