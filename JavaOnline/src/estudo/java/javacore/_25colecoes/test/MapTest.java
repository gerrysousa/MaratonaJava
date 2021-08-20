package estudo.java.javacore._25colecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("teklado", "teclado");
    map.put("vc", "você");
    map.put("mouze", "mouse");
    map.put("Meza", "mesa");
    System.out.println("------------Key--------------");
    for (String key : map.keySet()){
      System.out.println(key);
    }
    System.out.println("------------Values--------------");
    for (String value : map.values()){
      System.out.println(value);
    }
    System.out.println("-----------key:Value---------------");
    for (Map.Entry<String, String> entry : map.entrySet()){
      System.out.println(entry.getKey()+" : "+entry.getValue());
    }
    System.out.println("== LinkedHashMap fica na ordem de inserção=================");
    Map<String, String> map2 = new LinkedHashMap<>();
    map2.put("teklado", "teclado");
    map2.put("vc", "você");
    map2.put("mouze", "mouse");
    map2.put("Meza", "mesa");
    System.out.println("------------Key--------------");
    for (String key : map2.keySet()){
      System.out.println(key);
    }
    System.out.println("------------Values--------------");
    for (String value : map2.values()){
      System.out.println(value);
    }
    System.out.println("-----------key:Value---------------");
    for (Map.Entry<String, String> entry : map2.entrySet()){
      System.out.println(entry.getKey()+" : "+entry.getValue());
    }

  }
}
