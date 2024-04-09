package basic;

import java.util.Arrays;

public class WorkingWithArray {
    public static void main(String[] args) {
        String[] cars = {"Mazda","Nissan","Volvo","Honda"};
        // Loop Through an Array
        System.out.print(
                "3. Working with Array: \n"+
                "List of cars: ");
        for (String car : cars) {
            System.out.print(car+" ");
        }
        System.out.println();
        // Access the Elements of an Array
        System.out.print("Access the Elements of an Array: ");
        System.out.println(cars[3]);

        // Array Length
        System.out.println("Array Length: " + cars.length);
    }
}
