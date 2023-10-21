package JavaLooping;

import java.util.Scanner;

public class JavaLooping {
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While Loop
        int total = 0;
        int i = 1;
        while (i <= 5) {
            total += i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to 5: " + total);

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a positive number: ");
            num = scanner.nextInt();
        } while (num <= 0);

        System.out.println("You entered a positive number: " + num);

        // Looping through an Array
        System.out.println("\nLooping through an Array:");
        String[] fruits = { "Apple", "Banana", "Cherry", "Date" };
        for (String fruit : fruits) {
            System.out.println("I have a " + fruit);
        }
    }
}
