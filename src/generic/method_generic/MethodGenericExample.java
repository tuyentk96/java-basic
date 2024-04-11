package generic.method_generic;

public class MethodGenericExample {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Integer
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Print integer array: ");
        printArray(intArray);

        // String
        String[] stringArray = {"Java", "C", "C++", "Python"};
        System.out.println("Print string array: ");
        printArray(stringArray);
    }
}
