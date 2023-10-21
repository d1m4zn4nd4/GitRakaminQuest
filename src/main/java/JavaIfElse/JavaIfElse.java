package JavaIfElse;

public class JavaIfElse {
    public static void main(String[] args) {
        int number = 0;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Example with multiple conditions
        int age = 18;
        boolean isCitizen = true;

        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Example with nested if-else
        int x = 10;
        int y = 5;

        if (x > y) {
            if (x % 2 == 0) {
                System.out.println("x is greater than y, and it is even.");
            } else {
                System.out.println("x is greater than y, but it is not even.");
            }
        } else {
            System.out.println("x is not greater than y.");
        }
    }
}
