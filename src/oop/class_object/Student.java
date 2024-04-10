package oop.class_object;

public class Student {int id;
    String name;

    // constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display information method
    public void display() {
        System.out.println(id + " " + name);
    }
}
