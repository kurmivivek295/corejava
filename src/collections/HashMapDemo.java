package collections;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("Hi", "1");
        map.put("there", "2");
        map.put("I", "3");
        map.put("am", "4");
        map.put("Vivek", "5");

        List<Map.Entry<String, String>> entries = new ArrayList<>(map.entrySet());

        Collections.sort(entries, (s1, s2) -> {
            return s1.getKey().compareTo(s2.getKey());
        });

        Map<String, String> stringMap = entries.stream().collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
        stringMap.forEach((k, v) -> {
            System.out.println("{" + k + ", " + v + "}");
        });
    }

}
