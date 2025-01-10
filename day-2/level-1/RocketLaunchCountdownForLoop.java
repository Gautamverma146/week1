import java.util.Scanner;

public class RocketLaunchCountdownForLoop {
    public static void main(String[] args) {
        // Step 1: Get user input for the countdown starting value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the countdown starting value: ");
        int counter = scanner.nextInt();

        // Step 2: Use a for loop to countdown from the entered value to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println("T-" + i); // Print the countdown value
        }

        // Step 3: Print a message when the countdown finishes
        System.out.println("Launch!");

        // Close the scanner
        scanner.close();
    }
}
