package estudo.java.javacore._19datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

  public static void main(String[] args) {
    //ISO 639, pt=portugues BR- Brasil, en=ingles, US - Estatos Unidos
    Locale localItalia = new Locale("it", "IT");
    Locale localSuica = new Locale("it", "CH");
    Locale localJapao = new Locale("ja");
    Locale localBrasil = new Locale("pt", "BR");

    Calendar c = Calendar.getInstance();

    DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localItalia);
    DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localSuica);
    DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localJapao);
    DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localBrasil);

    System.out.println("Italia: "+df1.format(c.getTime()));
    System.out.println("Suica: "+df2.format(c.getTime()));
    System.out.println("Japao: "+df3.format(c.getTime()));
    System.out.println("Brasil: "+df4.format(c.getTime()));

    System.out.println(localItalia.getDisplayLanguage(localItalia));
    System.out.println(localBrasil.getDisplayLanguage(localItalia));
    System.out.println(localJapao.getDisplayLanguage(localItalia));
    System.out.println(localSuica.getDisplayLanguage(localItalia));

    System.out.println(localItalia.getDisplayLanguage(localBrasil));
    System.out.println(localBrasil.getDisplayLanguage(localBrasil));
    System.out.println(localJapao.getDisplayLanguage(localBrasil));
    System.out.println(localSuica.getDisplayLanguage(localBrasil));

    System.out.println(localItalia.getDisplayLanguage(localJapao));
    System.out.println(localBrasil.getDisplayLanguage(localJapao));
    System.out.println(localJapao.getDisplayLanguage(localJapao));
    System.out.println(localSuica.getDisplayLanguage(localJapao));
  }
}
