package estudo.java.javacore._7associacao.test;

import estudo.java.javacore._7associacao.classes.Aluno;
import estudo.java.javacore._7associacao.classes.Local;
import estudo.java.javacore._7associacao.classes.Professor;
import estudo.java.javacore._7associacao.classes.Seminario;

public class AssociacaoTest {

  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Fulano", 22);
    Aluno aluno2 = new Aluno("Cicrano", 21);

    Seminario semi1 = new Seminario("Como aprender uma linguagem nova.");
    Professor prof1 = new Professor("Tiao", "Programacao");
    Local local1 = new Local("Rua x", "Bairro x");

    aluno1.setSeminario(semi1);
    aluno2.setSeminario(semi1);

    semi1.setProfessor(prof1);
    semi1.setLocal(local1);
    semi1.setAlunos(new Aluno[]{aluno1, aluno2});

    Seminario[] seminarios = new Seminario[1];
    seminarios[0] = semi1;
    prof1.setSeminarios(seminarios);


    semi1.print();
    aluno1.print();
    aluno2.print();
    prof1.print();
    local1.print();

  }
}
