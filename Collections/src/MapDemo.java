import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String... args) {
            //HashMap
        System.out.println("**HashMap**");
        Map<String, Double> hashMap = new HashMap<>();
        hashMap.put("Иванов", 3434.34);
        hashMap.put("Петров", 123.22);
        hashMap.put("Сидоров", 1378.00);
        System.out.println("hashMap: " + hashMap);
            //keySet() - возвращает Set, который содержит ключи карты
        Set<String> keys = hashMap.keySet();
        System.out.println("keys Set: " + keys);
        for (String key : keys) {
            System.out.print(key + ": ");
            System.out.println(hashMap.get(key));
        }

        //**LinkedHashMap**
        System.out.println("\n**LinkedHashMap**");
        Map<Integer, Integer> map1 = new LinkedHashMap();
        map1.put(111, 999);
        map1.put(222, 888);
        System.out.println(map1.hashCode());
        System.out.println(map1);

            //**TreeMap**
        System.out.println("\n**TreeMap**");
        SortedMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("Иванов", 3434.34);
        treeMap.put("Петров", 123.22);
        treeMap.put("Сидоров", 1378.00);
        treeMap.forEach((k, v) -> System.out.println(k + ": " + v)); //лямбда-выражение

    }
}
