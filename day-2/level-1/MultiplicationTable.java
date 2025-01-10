import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Take integer input from the user
        System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        // Step 3: Print the multiplication table from 6 to 9
        System.out.println("Multiplication table of " + number + " from 6 to 9:");

        // Step 4: Use a for loop to generate the multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        
    }
}
