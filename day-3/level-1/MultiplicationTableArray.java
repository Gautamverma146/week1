import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        
        int[] multiplicationResult = new int[4];

        // Loop to calculate and store multiplication results
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the multiplication results
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        
    }
}
