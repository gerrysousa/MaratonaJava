package estudo.java.javacore._19datas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.sound.midi.Soundbank;

public class NumberFormatTest {

  public static void main(String[] args) {
    float valor = 654321.12345f;
    Locale localJP = new Locale("jp");
    Locale localBR = new Locale("br");
    Locale localIT = new Locale("it");
    Locale localUS = new Locale("us");
    Locale localFR = new Locale("fr");

    NumberFormat[] nfa = new NumberFormat[12];
    nfa[0] = NumberFormat.getInstance();
    nfa[1] = NumberFormat.getCurrencyInstance();
    nfa[2] = NumberFormat.getInstance(localUS);
    nfa[3] = NumberFormat.getCurrencyInstance(localUS);
    nfa[4] = NumberFormat.getInstance(localJP);
    nfa[5] = NumberFormat.getCurrencyInstance(localJP);
    nfa[6] = NumberFormat.getInstance(localBR);
    nfa[7] = NumberFormat.getCurrencyInstance(localBR);
    nfa[8] = NumberFormat.getInstance(localIT);
    nfa[9] = NumberFormat.getCurrencyInstance(localIT);
    nfa[10] = NumberFormat.getInstance(localFR);
    nfa[11] = NumberFormat.getCurrencyInstance(localFR);

    for(NumberFormat nf:nfa){
      System.out.println(nf.format(valor));
    }
    NumberFormat nf = NumberFormat.getInstance();
    System.out.println(nf.getMaximumFractionDigits());
    nf.setMaximumFractionDigits(2);
    System.out.println(nf.format(valor));
    String valorString = "200,123456";

    try{
      System.out.println("Parse string for number: "+nf.parse(valorString));
      nf.setParseIntegerOnly(true);
      System.out.println("Parse string for number, considerando inteiro: "+nf.parse(valorString));
    }catch (ParseException e){
      e.printStackTrace();
    }

  }
}
