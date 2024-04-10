package collections.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<>(20);

        // Add List method
        list.add("Java");
        list.add("JavaScript");
        list.add("Python");
        list.add("Java");
        list.add("C++");

        // size() method
        System.out.println("Size of list: " + list.size());

        // indexOf method
        System.out.println("Index of Java: "+ list.indexOf("Java"));

        // lastIndexOf method
        System.out.println("Last index of Java: "+ list.lastIndexOf("Java"));

        // display Arraylist
        System.out.println("ArrayList : " +list);

        // Remove list method
        list.remove(2);

        // Use Loop to display ArrayList
        System.out.println("Use loop for ArrayList: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // clear() method
        list.clear();
        System.out.println("After clearing list: " + list);
    }
}
