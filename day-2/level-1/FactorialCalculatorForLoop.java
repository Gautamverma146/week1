import java.util.Scanner;

public class FactorialCalculatorForLoop {
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
		
		 for (int i=1; i<=number;i++){
		 factorial *=i;
		 }
		
		System.out.println("The Factorial for "+ number + " is " + factorial);
		}
		}
		}