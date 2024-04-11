package generic.class_generic;

public class ClassGenericExample {
    public static void main(String[] args) {

        // String
        Generics<String> name = new Generics<>();
        name.add("John");
        System.out.println("Name: "+name.getInformation());

        // Integer
        Generics<Integer> age = new Generics<>();
        age.add(19);
        System.out.println("Age: "+age.getInformation());

        // Double
        Generics<Double> salary = new Generics<>();
        salary.add(450.5);
        System.out.println("Salary: "+salary.getInformation());

        // Boolean
        Generics<Boolean> isMarried = new Generics<>();
        isMarried.add(true);
        System.out.println("is Married? "+isMarried.getInformation());
    }
}
