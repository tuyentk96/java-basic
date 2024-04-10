package collections.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Java");
        map.put(3, "JavaScript");
        map.put(2, "Python");
        map.put(4, "Java");
        map.put(5, "C++");

        // show HashMap
        System.out.println("Show TreeMap: "+map);
    }
}
