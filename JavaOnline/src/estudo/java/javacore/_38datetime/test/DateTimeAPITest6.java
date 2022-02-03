package estudo.java.javacore._38datetime.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class DateTimeAPITest6 {

  public static void main(String[] args) {
    for (Map.Entry<String,String> zonas: ZoneId.SHORT_IDS.entrySet()){
      System.out.println(zonas.getKey()+ " "+zonas.getValue());
    }
    System.out.println("===========================================");
    System.out.println(ZoneId.systemDefault());
    ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
    System.out.println(tokyoZone);
    LocalDateTime dateTime1 = LocalDateTime.now();
    System.out.println(dateTime1);
    ZonedDateTime zonedDateTime1 = dateTime1.atZone(tokyoZone);
    System.out.println(zonedDateTime1);

    Instant instant1 = Instant.now();
    System.out.println(instant1);
    ZonedDateTime zonedDateTime2 = instant1.atZone(tokyoZone);
    System.out.println(zonedDateTime2);
    System.out.println(ZoneOffset.MIN);
    System.out.println(ZoneOffset.MAX);

    ZoneOffset manausOffset = ZoneOffset.of("-04:00");
    LocalDateTime dateTime2 = LocalDateTime.now();
    OffsetDateTime offsetDateTime1 = OffsetDateTime.of(dateTime2, manausOffset);
    System.out.println(offsetDateTime1);

    OffsetDateTime offsetDateTime2 = dateTime2.atOffset(manausOffset);
    System.out.println(offsetDateTime2);
    Instant instan2 = Instant.now();
    System.out.println(instan2.atOffset(manausOffset));

    JapaneseDate japaneseDate = JapaneseDate.from(LocalDateTime.now());
    System.out.println(japaneseDate);
    LocalDate antigamente  = LocalDate.of(1900,2,1);
    System.out.println(JapaneseDate.from(antigamente));
  }
}
