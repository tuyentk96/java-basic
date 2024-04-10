package basic;

public class Variables {
    public static void main(String[] args) {
        // String
        String firstName = "Do";
        String lastName = "Tuyen";
        System.out.println("String example: \n"+
                "Full Name: " + firstName + " " + lastName);

        // Integer
        int dateOfBirth = 1996;
        int age = 2024 - dateOfBirth;
        System.out.println("Integer example: \n"+
                "Age: " + age);

        // Float
        float mathScore = 3.5f;
        float literatureScore = 3.2f;
        float GPA = (mathScore + literatureScore)/2;
        System.out.println(
                "Float example: \n"+
                        "GPA: "+ GPA
        );

        // Double
        double dayWorking = 23.5;
        double salaryPerDay = 30;
        double totalSalary = dayWorking*salaryPerDay;
        System.out.println("Double example: \n"+
                "Total Salary: " + totalSalary);

        // Boolean
        boolean isActive = true;
        System.out.println("Boolean example: \n"+
                "System Active: " + isActive);

        // Type Casting
        // Widening Casting
        int timeInt = 14;
        double timeDouble = timeInt;
        System.out.println("Widening casting example: \n"+
                "Time Integer: "+ timeInt+"\n"+
                "Time Double: " + timeDouble);

        // Narrowing Casting
        double gpaDouble = 3.5;
        int gpaInt = (int) gpaDouble;
        System.out.println("Narrowing casting example: \n"+
                "GPA Double: " + gpaDouble+"\n"+
                "GPA Integer: "+ gpaInt
        );
    }
}
