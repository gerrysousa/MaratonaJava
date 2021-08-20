package estudo.java.javacore._25colecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {

  public static void main(String[] args) {
    NavigableMap<String, String> map = new TreeMap<>();
    map.put("A","Letra A");
    map.put("D","Letra D");
    map.put("C","Letra C");
    map.put("B","Letra B");
    map.put("E","Letra E");
    System.out.println("A classe que será a chave deve implementar o comparable, nesse exemplo utilizamos String");

    for (Map.Entry<String, String> entry: map.entrySet()){
      System.out.println(entry.getKey() +": "+entry.getValue());
    }
    System.out.println(map.size());
    System.out.println("map.headMap(c) > retorna abaixo: "+map.headMap("C"));
    System.out.println("map.headMap(c, true) > retorna abaixo e key: "+map.headMap("C", true));

    System.out.println("map.higherEntry retorna a proxima chave: "+map.higherEntry("B"));
    System.out.println(map.descendingMap());

    System.out.println("----------------------------");
    System.out.println("lower < : primeiro produto menor antes do C: "+ map.lowerKey("C"));
    System.out.println("floor <= : primeiro produto menor antes do C incluindo C: "+ map.floorKey("C"));
    System.out.println("higher > : primeiro produto maior depois do C: "+ map.higherKey("C"));
    System.out.println("ceiling >= : primeiro produto maior depois do C: incluindo C: "+ map.ceilingKey("C"));
  }
}
