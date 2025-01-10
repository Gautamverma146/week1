import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a positive integer to find its factors: ");
        int number = scanner.nextInt();

        // Check if the input is valid
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Initialize variables for storing factors
        int maxFactor = 10;                  
        int[] factors = new int[maxFactor]; 
        int index = 0;                       

        // Find and store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize array if needed
                if (index == maxFactor) {
                    maxFactor *= 2;  // Double the size
                    int[] temp = new int[maxFactor];
                    
                   
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;  // Assign temp array to factors
                }

                // Add factor to the array
                factors[index] = i;
                index++;
            }
        }

     
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println();  // Move to the next line
       
    }
}
