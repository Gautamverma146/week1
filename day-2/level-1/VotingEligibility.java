import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Step 1: Get input for age
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        // Step 2: Check if the person can vote based on age
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the scanner
        scanner.close();
    }
}
