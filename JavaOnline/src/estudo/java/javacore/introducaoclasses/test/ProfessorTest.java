package estudo.java.javacore.introducaoclasses.test;

import estudo.java.javacore.introducaoclasses.classes.Professor;

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

    System.out.println(prof.nome);
    System.out.println(prof.matricula);
    System.out.println(prof.rg);
    System.out.println(prof.cpf);
    System.out.println("------------------");
    System.out.println(prof2.nome);
    System.out.println(prof2.matricula);
    System.out.println(prof2.rg);
    System.out.println(prof2.cpf);
  }
}
