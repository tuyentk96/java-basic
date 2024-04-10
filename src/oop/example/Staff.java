package oop.example;

public class Staff extends Officer{
    private String task;

    public Staff(String name, int age, String gender, String adderess, String task) {
        super(name, age, gender, adderess);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", adderess='" + getAdderess() + '\'' +
                ", task='" + task + '\'' +
                "} " ;
    }
}
