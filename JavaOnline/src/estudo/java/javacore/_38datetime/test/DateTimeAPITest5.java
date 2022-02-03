package estudo.java.javacore._38datetime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeAPITest5 {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();

    String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
    System.out.println("BASIC_ISO_DATE: "+s1);

    String s2 = date.format(DateTimeFormatter.ISO_DATE);
    System.out.println("ISO_DATE: "+s2);

    String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
    System.out.println("ISO_LOCAL_DATE: "+s3);

    String s4 = "20220203";
    LocalDate parse1 = LocalDate.parse(s4, DateTimeFormatter.BASIC_ISO_DATE);
    System.out.println("parse1: "+parse1);

    String s5 = "2022-02-03";
    LocalDate parse2 = LocalDate.parse(s5);
    System.out.println("parse2: "+parse2);

    String s6 = "2022-02-03+05:00";
    LocalDate parse3 = LocalDate.parse(s6, DateTimeFormatter.ISO_DATE);
    System.out.println("parse3: "+parse3);

    LocalDateTime dateTime = LocalDateTime.now();
    String s7 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
    System.out.println("ISO_DATE_TIME: "+s7);

    LocalDateTime parse4 = LocalDateTime.parse("2022-02-03T06:26:59.3029486");
    System.out.println(parse4);

    DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String formatBR = LocalDate.now().format(formatterBR);
    System.out.println(formatBR);

    String dataBRString = "01/02/2022";
    LocalDate parse5 = LocalDate.parse(dataBRString,formatterBR);
    System.out.println(parse5);

    DateTimeFormatter formatterCA = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.CANADA);
    String formatCA = LocalDate.now().format(formatterCA);
    System.out.println(formatCA);

    LocalDate parse6 = LocalDate.parse("03.July.2021",formatterCA);
    System.out.println(parse6);
  }
}
