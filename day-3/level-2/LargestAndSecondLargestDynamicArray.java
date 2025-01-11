import java.util.Scanner;

public class LargestAndSecondLargestDynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        // Step 2: Initialize maxDigit and the digits array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        //  Extract digits and store in the array
        while (number != 0) {
            // If index equals maxDigit, increase array size by 10
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
				// Assign expanded array back to digits
                digits = temp; 
            }

            // Store the digit
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        //  the largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second Largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }

        
    }
}
