package oop.inheritance.single_inheritance;

public class Programmer extends Employee{
    double bonus;


    public Programmer(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
}
