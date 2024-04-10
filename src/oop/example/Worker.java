package oop.example;

public class Worker extends Officer {

    private int level;


    public Worker(String name, int age, String gender, String adderess, int level) {
        super(name, age, gender, adderess);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", adderess='" + getAdderess() + '\'' +
                ", level=" + level +
                "} ";
    }
}
