package oop.inheritance.hierarchical_inheritance;

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.println("Cat action: ");
        cat.eat();
        cat.meow();
        System.out.println("Dog action: ");
        dog.eat();
        dog.bark();
    }
}
