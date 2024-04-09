package oop;

public class Officer {
    //Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.
    private String name;
    private int age;
    private String gender;
    private String adderess;

    public Officer(String name, int age, String gender, String adderess) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adderess = adderess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdderess() {
        return adderess;
    }

    public void setAdderess(String adderess) {
        this.adderess = adderess;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", adderess='" + adderess + '\'' +
                '}';
    }
}
