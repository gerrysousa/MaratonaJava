package estudo.java.javacore._38datetime.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateTimeAPITest3 {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.of(2020, Month.AUGUST, 12);
    System.out.println("LocalDate.of(2020, Month.AUGUST, 12); "+localDate);
    localDate = localDate.withYear(2018);
    System.out.println(""+localDate);
    localDate = localDate.withMonth(Month.JUNE.getValue());
    System.out.println("localDate.withMonth(Month.JUNE.getValue()); "+localDate);
    localDate = localDate.withDayOfMonth(27);
    System.out.println("localDate.withDayOfMonth(27); "+localDate);
    localDate = localDate.with(ChronoField.DAY_OF_MONTH, 18);
    System.out.println("localDate.with(ChronoField.DAY_OF_MONTH, 18); "+localDate);
    localDate = localDate.plusMonths(2);
    System.out.println("localDate.plusMonths(2); "+localDate);
    localDate = localDate.plus(2, ChronoUnit.MONTHS);
    System.out.println("localDate.plus(2, ChronoUnit.MONTHS); "+localDate);
    localDate = localDate.plus(2, ChronoUnit.MONTHS).minusDays(8);
    System.out.println("localDate.plus(2, ChronoUnit.MONTHS).minusDays(8); "+localDate);

    LocalTime localTime = LocalTime.now();
    System.out.println("LocalTime.now(); "+localTime);
    localTime = localTime.withHour(10);
    System.out.println("localTime.withHour(10); "+localTime);
    localTime = localTime.plusHours(3);
    System.out.println("localTime.plusHours(3); "+localTime);
    localTime = localTime.plusHours(3).minusMinutes(25);
    System.out.println("localTime.plusHours(3).minusMinutes(25); "+localTime);
    localTime = localTime.minusMinutes(30);
    System.out.println("localTime.minusMinutes(30); "+localTime);

  }
}
