package estudo.java.javacore._38datetime.test;

import estudo.java.javacore._38datetime.util.ObterProximoDiaUtil;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAPITest4 {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);
    System.out.println(localDate.getDayOfWeek());

    localDate = localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
    System.out.println(localDate);
    System.out.println(localDate.getDayOfWeek());

    localDate = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    System.out.println(localDate);
    System.out.println(localDate.getDayOfWeek());

    localDate = localDate.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
    System.out.println(localDate);
    System.out.println(localDate.getDayOfWeek());

    localDate = localDate.with(TemporalAdjusters.firstDayOfMonth());
    System.out.println(localDate);
    System.out.println(localDate.getDayOfWeek());

    localDate = localDate.with(TemporalAdjusters.lastDayOfMonth());
    System.out.println(localDate);
    System.out.println(localDate.getDayOfWeek());

    localDate = localDate.with(TemporalAdjusters.firstDayOfNextYear());
    System.out.println(localDate);
    System.out.println(localDate.getDayOfWeek());

    localDate = localDate.with(new ObterProximoDiaUtil());
    System.out.println(localDate);
    System.out.println(localDate.getDayOfWeek());

    localDate = LocalDate.of(2022,01,28);
    System.out.println(localDate);
    System.out.println(localDate.getDayOfWeek());

    localDate = localDate.with(new ObterProximoDiaUtil());
    System.out.println(localDate);
    System.out.println(localDate.getDayOfWeek());
  }
}
