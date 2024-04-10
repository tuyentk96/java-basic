package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // add method
        set.add("Java");
        set.add("JavaScript");
        set.add("Python");
        set.add("C++");

        // size
        System.out.println("Size of set: " + set.size());

        // elements in set
        System.out.println("elements in set: " + set);

        // use loop to display element
        System.out.println("Use loop to display element: ");
        for (String s : set) {
            System.out.println(s);
        }

        // contains method
        System.out.println("Is set contains Java? " + set.contains("Java"));
        System.out.println("Is set contains C#? " + set.contains("C#"));

        // addAll method
        HashSet<String> setA = new HashSet<>();
        setA.addAll(set);
        System.out.println("show setA after addAll: " + setA);

        // remove method
        System.out.println("show setA before remove Python: " +setA);
        setA.remove("Python");
        System.out.println("show setA after remove Python: " + setA);

        // clear method
        System.out.println("show setA before clear: " + setA);
        setA.clear();
        System.out.println("show setA after clear: " + setA);

        // isEmpty method
        System.out.println("is set empty? " + set.isEmpty());
        System.out.println("is setA empty? " + setA.isEmpty());

        // use addAll to convert set to list
        List<String> list = new ArrayList<>();
        list.addAll(set);
        System.out.println("show list: " + list);
    }
}
