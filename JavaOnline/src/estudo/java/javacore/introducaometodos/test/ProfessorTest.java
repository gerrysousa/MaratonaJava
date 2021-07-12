package estudo.java.javacore.introducaometodos.test;

import estudo.java.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {

  public static void main(String[] args) {
    Professor prof = new Professor();
    prof.nome="Cicrano";
    prof.matricula="123456";
    prof.rg="12345678";
    prof.cpf="111.111.111-11";

    Professor prof2 = new Professor();
    prof2.nome="Deocrano";
    prof2.matricula="456789";
    prof2.rg="456789";
    prof2.cpf="222.222.222-22";

    //prof=prof2;

    prof.imprimeProfessor(prof);
    prof.imprimeProfessor(prof2);
  }
}
