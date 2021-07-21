package estudo.java.javacore._19datas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipularLocalDeDatasTest {

  public static void main(String[] args) {
    Date date = new Date();
    System.out.println("Atual date: "+date);
    date.setTime(date.getTime()+3_600_000L);
    System.out.println("Adicionado valor a date: "+date);

    Calendar c = Calendar.getInstance();
    System.out.println(c);
  //  c.setTime(date);

    if (Calendar.SUNDAY== c.getFirstDayOfWeek()){
      System.out.println("Domingo é o primeiro dia da semana");
    }
    System.out.println("Dia da semana: "+c.get(Calendar.DAY_OF_WEEK));
    System.out.println("Dia do mês: "+c.get(Calendar.DAY_OF_MONTH));
    System.out.println("Dia da ano: "+c.get(Calendar.DAY_OF_YEAR));

    Date date2 = c.getTime();
    System.out.println("Date2:" +date2);
    c.add(Calendar.HOUR,2);
    date2 = c.getTime();
    System.out.println("Date2 add 2 horas:" +date2);

    c.roll(Calendar.MONTH,10);
    date2 = c.getTime();
    System.out.println("Date2 add 10 meses sem virar o ano, utilizando o metodo roll:" +date2);

    System.out.println("As classes para trabalhar com Numeros, Datas ou com moedas são: NumberFormat, Locale, Calendar, Date, DateFormat");

  }
}
