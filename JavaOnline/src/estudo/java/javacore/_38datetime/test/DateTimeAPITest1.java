package estudo.java.javacore._38datetime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class DateTimeAPITest1 {

  public static void main(String[] args) {
    System.out.println("java.util.Date: " + new Date());
    System.out.println("java.util.Calendar: " + Calendar.getInstance());

    System.out.println("-------------LocalDate----------------------");
    LocalDate localDateNow = LocalDate.now();
    LocalDate localDate1 = LocalDate.of(2019, 10, 15);
    LocalDate localDate2 = LocalDate.of(2020, Month.APRIL, 6);

    System.out.println(localDate1.getYear());
    System.out.println(localDate1.getMonth());
    System.out.println(localDate1.getMonthValue());
    System.out.println(localDate1.getDayOfMonth());
    System.out.println(localDate1.getDayOfWeek());
    System.out.println(localDate1.getDayOfYear());
    System.out.println(localDate2.lengthOfMonth());
    System.out.println(localDate2.lengthOfYear());
    System.out.println(localDate2.isLeapYear());
    System.out.println(localDate2.get(ChronoField.DAY_OF_MONTH));
    System.out.println(localDate2.get(ChronoField.YEAR));
    System.out.println(localDateNow);
    System.out.println(LocalDate.MAX);
    System.out.println(LocalDate.MIN);

    System.out.println("--------------LocalTime---------------------");
    LocalTime localTime1 = LocalTime.of(22, 45, 30);
    LocalTime localTimeNow = LocalTime.now();

    System.out.println(localTimeNow);
    System.out.println(localTime1);
    System.out.println(localTime1.getHour());
    System.out.println(localTime1.getMinute());
    System.out.println(localTime1.getSecond());
    System.out.println(LocalTime.MAX);
    System.out.println(LocalTime.MIN);

    System.out.println("---------------LocalDateTime--------------------");
    LocalDateTime localDateTime1 = LocalDateTime.of(2019, 10, 15, 23, 35, 49);
    LocalDateTime localDateTime2 = LocalDateTime.now();
    LocalDateTime localDateTime3 = localDate1.atTime(10, 57, 53);
    LocalDateTime localDateTime4 = localTime1.atDate(localDate2);
    LocalDateTime localDateTime5 = localDate1.atTime(LocalTime.now());
    LocalDateTime localDateTime6 = localTime1.atDate(LocalDate.now());

    System.out.println(localDateTime1);
    System.out.println(localDateTime2);
    System.out.println(localDateTime3);
    System.out.println(localDateTime4);
    System.out.println(localDateTime5);
    System.out.println(localDateTime6);

    System.out.println("---------------Parsing--------------------");
    LocalDate parseDate = LocalDate.parse("2022-09-15");
    LocalTime parseTime = LocalTime.parse("23:35:10");

    System.out.println(parseDate);
    System.out.println(parseTime);
  }
}
