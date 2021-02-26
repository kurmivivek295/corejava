package collections;

import java.util.*;

public class MapSortDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("Hi", "1");
        map.put("there", "2");
        map.put("I", "3");
        map.put("am", "4");
        map.put("Vivek", "5");

        map.forEach((k,v) -> {
            System.out.println("{" + k + ", " + v + "}");
        });
        System.out.println();

        List<Map.Entry<String, String>> list = new ArrayList(map.entrySet());
        Collections.sort(list, (e1, e2) -> {
            return e1.getValue().compareTo(e2.getValue());
        });

/*
        list.forEach(m -> {
            System.out.println("{" + m.getKey() + ", " + m.getValue() + "}");
        });
*/

        Map<String, String> sortedMap = new LinkedHashMap<>();

        list.forEach(m -> {
            sortedMap.put(m.getKey(), m.getValue());
        });

        sortedMap.forEach((k, v) -> {
            System.out.println("{" + k + ", " + v + "}");
        });
    }
}
