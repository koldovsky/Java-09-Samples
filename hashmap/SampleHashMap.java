package hashmap;

import java.util.HashMap;
import java.util.Map;

public class SampleHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(2, "Two");

        String text = map.get(6);

        System.out.println("Sample get " + text);

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }
    }
}
