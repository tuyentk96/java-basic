package method;

public class Method {
    static void myMethod(){
        System.out.println("I just got executed method example");
    }

    static void nameMethod(String name){
        System.out.println("Name: "+ name);
    }

    public void instanceMethod(){
        System.out.println("this is an instance method");
    }

    static void staticMethod(){
        System.out.println("this is a static method");
    }

    public static void main(String[] args) {
        // print method
        System.out.println("Method example: ");
        myMethod();

        // print method with parameters
        System.out.println("Method Parameters: ");
        nameMethod("Tuyen");

        // understanding instance and static method
        System.out.println("Understanding instance and static method: ");
        staticMethod();

        Method method = new Method();
        method.instanceMethod();
    }
}
