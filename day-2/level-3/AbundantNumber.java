import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Step 1: Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Initialize sum variable to 0
        int sum = 0;

        // Step 3: Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            // Step 4: Check if number is divisible by i
            if (number % i == 0) {
          
	
             sum += i;
            }
        }

        // Step 6: Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }

    }
}

		