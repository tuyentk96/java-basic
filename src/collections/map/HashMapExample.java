package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Java");
        map.put(3, "JavaScript");
        map.put(2, "Python");
        map.put(4, "Java");
        map.put(5, "C++");

        // show HashMap
        System.out.println("Show HashMap "+map);

        // size
        System.out.println("size of HashMap: "+map.size());

        // use loop to show element in HashMap
        System.out.println("Use loop to show element in Hashmap: ");
        for(int key : map.keySet()){
            System.out.println(key+" - "+map.get(key));
        }

        // use entry to show element in HashMap
        System.out.println("Use entry to show element in HashMap: ");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        // update value key = 4 from "Java" to "C#"
        System.out.println("show HashMap before update key = 4: "+ map);
        map.put(4, "C#");
        System.out.println("show HashMap after update key = 4: "+ map);

        // remove key = 4
        System.out.println("show HashMap before remove key = 4: "+ map);
        map.remove(4);
        System.out.println("show HashMap after remove key = 4: "+ map);

        // clear
        System.out.println("show HashMap before clear: "+map);
        map.clear();
        System.out.println("show HashMap after clear: "+map);
    }
}
