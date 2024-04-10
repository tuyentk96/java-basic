package oop.inheritance.single_inheritance;

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Programmer programmer = new Programmer(1,"John",2000,50);
        System.out.println("Programmer salary is " + programmer.salary +" $");
        System.out.println("Programmer bonus is " + programmer.bonus +" $");
    }
}
