
import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter a natural number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Step 3: Validate if the input is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {
            // Step 4: Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Step 5: Check if the number is even or odd using modulus operator
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number.");
                } else {
                    System.out.println(i + " is an Odd number.");
                }
            }
        }

        
    }
}

