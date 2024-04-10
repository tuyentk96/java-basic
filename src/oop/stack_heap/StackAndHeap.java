package oop.stack_heap;

public class StackAndHeap {


    private static Person buildPerson(int id,String name) {
        return new Person(id,name);
    }

    public static void main(String[] args) {
        int id = 1;
        String name = "John";

        Person person1 = null;
        person1 = buildPerson(id,name);

        Person person2 = new Person(2,"Mark");
    }
}
