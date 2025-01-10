import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		//get input
		// Check if the input is a positive integer
		if (number < 0){
		System.out.println("Factorial is not defined for negative numbers");
		}
		
		else{
		long factorial = 1;
		int i = 1;
		
		while (i <= number){
		factorial *= i;
		i++;
		}
		System.out.println("The Factorial for "+ number + " is " + factorial);
		}
		}
		}
		