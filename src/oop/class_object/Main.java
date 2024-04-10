package oop.class_object;

public class Main {
    public static void main(String[] args) {
        // Create Object
        Student student1 = new Student(1, "Nam");
        Student student2 = new Student(2, "Long");

        student1.display();
        student2.display();
    }
}
