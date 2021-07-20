package estudo.java.javacore._17wrappers.test;

public class WrappersTest {

  public static void main(String[] args) {
    byte bytePrimitivo = 1;
    short shortPrimitivo = 1;
    int intPrimitivo = 10;
    long longPrimitivo = 10;
    float floatPrimitivo = 10;
    double doublePrimitivo = 10;
    char charPrimitivo = 'A';
    boolean booleanPrimitivo = true;

    Byte byteWrapper = 1;
    Short shortWrapper = 1;
    Integer integerWrapper = 10; //pode ser inicializado assim: Integer integerWrapper = new Integer('10'); aceita string
    Long longWrapper = 10L; //pode ser inicializado assim: Long longWrapper = Long.valueOf("10");

    Float floatWrapper = 10F;
    Double doubleWrapper = 10D;
    Character characterWrapper = 'A';// não aceita string: Character characterWrapper = new Character('A');
    Boolean booleanWrapper = true;//case insensitive, aceita maiusculo ou minusclo : Boolean booleanWrapper = new Boolean("True");


    int iUnbox = integerWrapper; // Isso é chamado de unboxing
    System.out.println("Unboxing: "+iUnbox);

    String valorString = "10";
    Float f = Float.parseFloat(valorString);
    System.out.println(f);

    System.out.println("-------------------- metodos uteis --------------------");
    System.out.println(Character.isDigit('A'));
    System.out.println(Character.isLetter('9'));
    System.out.println(Character.isLetterOrDigit('#'));
    System.out.println(Character.isUpperCase('a'));
    System.out.println(Character.isLowerCase('b'));
    System.out.println(Character.toUpperCase('a'));


  }
}
