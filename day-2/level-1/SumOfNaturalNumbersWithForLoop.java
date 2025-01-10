import java.util.Scanner;

public class SumOfNaturalNumbersWithForLoop {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter a natural number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Step 3: Check if the input is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Step 4: Calculate the sum using the formula n*(n+1)/2
            int sumFormula = n * (n + 1) / 2;

            // Step 5: Calculate the sum using a for loop
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            // Step 6: Print both results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumLoop);

            // Step 7: Compare both results and display the comparison
            if (sumFormula == sumLoop) {
                System.out.println("Both sums are equal. The computation is correct.");
            } else {
                System.out.println("The sums are not equal. There is an error in the computation.");
            }
        }

        
    }
}
