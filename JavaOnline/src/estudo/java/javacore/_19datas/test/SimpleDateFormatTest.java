package estudo.java.javacore._19datas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    String mascara1 = "'Toronto', dd 'de' MMMM 'de' yyyy";
    SimpleDateFormat format = new SimpleDateFormat(mascara1);
    System.out.println(format.format(c.getTime()));

    String mascara2 = "yyyy-MM-dd";
    format = new SimpleDateFormat(mascara2);
    System.out.println(format.format(c.getTime()));

    String mascara3 = "yyyy-MM-dd HH:mm:ss";
    format = new SimpleDateFormat(mascara3);
    System.out.println(format.format(c.getTime()));
  }
}
