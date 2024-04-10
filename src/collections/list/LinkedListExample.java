package collections.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // add method
        list.add("Java");
        list.add("JavaScript");
        list.add("Python");
        list.add("Java");
        list.add("C++");

        // size() method
        System.out.println("size of list: " + list.size());

        //Display LinkedList
        System.out.println("List: " + list);

        // Remove list method
        list.remove(2);

        // Use loop to display LinkedList
        System.out.println("Use loop to display LinkedList: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // indexOf method
        System.out.println("Index of Java: "+ list.indexOf("Java"));

        // lastIndexOf method
        System.out.println("Last index of Java: "+ list.lastIndexOf("Java"));

        // addAll method
        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(list);
        System.out.println("Show list A after addAll list: "+listA);

        //retainAll method
        LinkedList<String> listB = new LinkedList<>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.println("Show list A after retaining listB: "+listA);

        // update element method
        System.out.println("show list before set: "+list);
        list.set(3,"C#");
        System.out.println("C++ -> C# Updating.....");
        System.out.println("show list after set: "+list);

        // clear method
        System.out.println("Show list before clear: "+list);
        list.clear();
        System.out.println("show list after clear: "+list);
    }
}
