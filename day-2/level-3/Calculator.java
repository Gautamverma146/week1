import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Step 1: Create two double variables for the operands and a String variable for the operator
        double first, second, result;
        String op;

        // Step 2: Get input values for first operand, second operand, and operator
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();

        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();

        // Step 3: Use switch...case to perform the appropriate operation
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator.");
                break;
        }

       
    }
}
