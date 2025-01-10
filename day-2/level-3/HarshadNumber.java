import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Step 1: Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int sum = 0;
        int originalNumber = number;

        // Step 3: Use a while loop to access each digit of the number
        while (number != 0) {
            // Step 4: Add each digit of the number to sum
            sum += number % 10;

            // Remove the last digit
            number /= 10;
        }

        // Step 5: Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }

        
    }
}
