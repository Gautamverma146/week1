import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Step 2: Check if the number is positive
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        // Step 3: Create a String array to store the results
        String[] fizzBuzzArray = new String[number + 1];

        // Step 4: Loop from 0 to the entered number and apply FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                fizzBuzzArray[i] = "0";  // Special case for 0
            } else if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzzArray[i] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzzArray[i] = "Buzz";
            } else {
                fizzBuzzArray[i] = Integer.toString(i);
            }
        }

        // Step 5: Display the results with index positions
        System.out.println("\nFizzBuzz Results:");
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzArray[i]);
        }

        
    }
}
