package pl.camp.it.kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(123, "Mateusz");
        map.put(1234, "Janusz");
        map.put(12345, "Karol");

        //??????
        System.out.println(map.size());

        System.out.println(map.get(123));

        Set<Map.Entry<Integer, String>> pary = map.entrySet();

        for(Map.Entry<Integer, String> para : pary) {
            System.out.println(para.getKey());
            System.out.println(para.getValue());
        }

        Map<String, String> properties = new HashMap<>();

        properties.put("S1", "123.123.123.124");
        properties.put("S2", "123.322.234.432");
        properties.put("S3", "543.23.213.65");
        properties.put("S4", "534.23.234.3");

        properties.get("S1");
    }
}
