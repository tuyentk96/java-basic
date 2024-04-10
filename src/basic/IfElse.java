package basic;

public class IfElse {
    public static void main(String[] args) {

        // If example
        int x = 20;
        int y = 18;
        System.out.println("If example: ");
        if (x>y){
            System.out.println("x is greater than y");
        }

        int time = 10;

        // If else example
        System.out.println("If-else example: ");
        if(time < 18){
            System.out.println("Good Day!");
        }else {
            System.out.println("Good Evening!");
        }

        // If - else if - else
        System.out.println("If-else if-else example: ");
         if (time < 12) {
            System.out.println("Good Morning!");
        }else if(time < 18){
            System.out.println("Good Afternoon!");
        } else {
            System.out.println("Good Evening!");
        }
    }
}
