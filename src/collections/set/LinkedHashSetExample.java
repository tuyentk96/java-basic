package collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();

        set.add("Java");
        set.add("JavaScript");
        set.add("Python");
        set.add(null);
        set.add("C++");

        System.out.println("Show LinkedHashSet: " + set);
    }
}
