package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mukul", 50);
        map.put("Anmol", 100);
        map.put("Ram", 80);
        map.put("Mohan", 20);
        System.out.println(map);
        System.out.println(map.get("Mukul"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("Geeta"));
        System.out.println(map.remove("Mohan"));
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.printf("%s : %s \n", key, map.get(key));
        }
    }
}
