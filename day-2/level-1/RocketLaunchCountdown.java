
import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Step 1: Get user input for the countdown starting value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the countdown starting value: ");
        int counter = scanner.nextInt();

        // Step 2: Use a while loop to countdown from the entered value to 1
        while (counter >= 1) {
			// Print the countdown value
            System.out.println("T-" + counter); 
			// Decrement the counter
            counter--; 
        }

        // Step 3: Print a message when the countdown finishes
        System.out.println("Launch!");

        
        
    }
}

