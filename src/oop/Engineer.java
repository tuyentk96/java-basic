package oop;

public class Engineer extends Officer{
    private String major;

    public Engineer(String name, int age, String gender, String adderess, String major) {
        super(name, age, gender, adderess);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", adderess='" + getAdderess() + '\'' +
                ", major='" + major + '\'' +
                "} ";
    }
}
