package estudo.java.javacore._29concorrencia.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcorrenciaDeColecoesTest {

  public static void main(String[] args) {
    /**
     ConcurrentHashMap
     ConcurrentLinkedDeque: sao thread safe, remover primeiro, remover ultimo
     ConcurrentLinkedQueue: sao thread safe, remover primeiro, remover ultimo
     ConcurrentSkipListMap: Implementam o sort, comparable, comparator
     ConcurrentSkipListSet: Implementam o sort, comparable, comparator

     - Não implementam CopyOnWrite.
     - Iterator é wick Consistently, fracamente consistente
     - se vc estiver iterando, outra thread pode agir sobre a lista, e a iteração ser infinita
     - mesma coisa pro size, pode acontecer de o size mudar
     */


    Map<String, String> map = new HashMap<>();
    map.put("1","1");
    map.put("1","2");
    System.out.println("Usando Map: "+map.get("1"));

    ConcurrentHashMap<String, String> map2 = new ConcurrentHashMap<>();
    map2.put("1","1");
    map2.putIfAbsent("1","2");
    System.out.println("Usando putIfAbsent(Add se não existir a key) em ConcurrentHashMap: "+map2.get("1"));
  }

}
