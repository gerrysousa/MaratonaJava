package estudo.java.javacore._38datetime.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeAPITest2 {

  public static void main(String[] args) {

    System.out.println("-------------Instant----------------------");
    Instant instant = Instant.now();
    System.out.println(instant);
    System.out.println(LocalTime.now());
    System.out.println("2022-01-24T09:53:20.500421100Z--> T=separa Data da hora--e o Z= significa Zulu Time, ou UTC");

    System.out.println(instant.getEpochSecond());
    System.out.println(instant.getNano());
    System.out.println(Instant.ofEpochSecond(3));
    System.out.println(Instant.ofEpochSecond(3,0));
    System.out.println(Instant.ofEpochSecond(3,1_000_000_000));
    System.out.println(Instant.ofEpochSecond(3,-1_000_000_000));
    System.out.println(Instant.ofEpochSecond(3,900_000_000));

    System.out.println("-------------Duration----------------------");
    LocalDateTime dateTime1 = LocalDateTime.now();
    LocalDateTime dateTime2 = LocalDateTime.of(2020,10, 8,22,45,57);
    LocalTime time1 = LocalTime.now();
    LocalTime time2 = LocalTime.of(21,37,58);

    Duration duration1 = Duration.between(dateTime1, dateTime2);
    Duration duration2 = Duration.between(time1, time2);
    Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
    //Duration duration4 = Duration.between(dateTime1, time2);
    //Duration duration5 = Duration.between(LocalDate.now(), LocalDate.now().plusDays(10));
    Duration duration6 = Duration.between(dateTime1, time2.atDate(dateTime2.toLocalDate()));
    Duration duration7 = Duration.ofMinutes(3);
    Duration duration8 = Duration.ofDays(10);

    System.out.println(duration1);
    System.out.println(duration2);
    System.out.println(duration3);
    System.out.println(duration6);
    System.out.println(duration7);
    System.out.println(duration8);

    System.out.println("-------------Duration----------------------");
    Period period1 = Period.between(dateTime1.toLocalDate(), dateTime2.toLocalDate());
    Period period2 = Period.ofDays(10);
    Period period3 = Period.ofWeeks(30);
    Period period4 = Period.ofMonths(5);
    Period period5 = Period.ofYears(10);

    System.out.println(period1);
    System.out.println(period2);
    System.out.println(period3);
    System.out.println(period4);
    System.out.println(period5);
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now.until(now.plusDays(period3.getDays()), ChronoUnit.MONTHS));

    System.out.println("-------------ChronoUnit----------------------");
    LocalDateTime localDateTimeX = LocalDateTime.of(1999,02,28,15,45,28);

    System.out.println(ChronoUnit.DAYS.between(localDateTimeX, now));
    System.out.println(ChronoUnit.WEEKS.between(localDateTimeX, now));
    System.out.println(ChronoUnit.MONTHS.between(localDateTimeX, now));
    System.out.println(ChronoUnit.YEARS.between(localDateTimeX, now));

  }
}
