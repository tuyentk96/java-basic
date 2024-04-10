package collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1, "Java");
        map.put(3, "JavaScript");
        map.put(2, "Python");
        map.put(4, "Java");
        map.put(5, "C++");

        // show HashMap
        System.out.println("Show LinkedHashMap: "+map);
    }
}
