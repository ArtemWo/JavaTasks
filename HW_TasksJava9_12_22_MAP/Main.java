package HW_TasksJava.HW_TasksJava9_12_22_MAP;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
/*   todo Дана Map<String,String>ab. написать метод, который вернет мапу, такую что
      если в исходной мапе есть ключи "а" и "b" то нужно создать новый ключ "аb"
      с суммой значений от ключей а и b а если нет, ничего не менять
      Примеры:
      mapAB {"a":"Hi", b:There}-> {"a":Hi; ab: HiThere;b:There}
      mapAB {a:Hi}->{a:Hi}
      mapAB {b:There}->{b:There}
      public Map<String,String>ab(Map<String,String>mapAB)*/
        Map<String, String> mapAB = new HashMap<>();
        mapAB.put("aaa", " Hi");
        mapAB.put("bbb", " There");

        System.out.print(ab(mapAB));

    }
    public static Map<String, String> ab(Map<String, String> mapAB) {
        if (mapAB.containsKey("aaa") && mapAB.containsKey("bbb")) {
            mapAB.put("ab", mapAB.values().toString());
        }
        return mapAB;
    }
}