package oop.abstract_class;

public class AbstractClassExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat  = new Cat();

        System.out.println("Dog action: ");
        dog.run();
        dog.sound();
        System.out.println("Cat action: ");
        cat.run();
        cat.sound();
    }
}
