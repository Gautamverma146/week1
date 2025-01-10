import java.util.Scanner;

public class OddEvenNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get number from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return;  // Exit the program
        }

        // Arrays to store odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Index variables for odd and even arrays
        int evenIndex = 0;
        int oddIndex = 0;

        
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();  // Move to the next line

       
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();  // Move to the next line

        
    }
}
