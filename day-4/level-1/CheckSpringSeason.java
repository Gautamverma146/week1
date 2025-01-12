
import java.util.Scanner;

public class  CheckSpringSeason {

	public static boolean checkSeason(double month, double day){
	// Performing  operations
	//Spring Season is from March 20 to June 20

	
	if((day>= 20 && month >= 3) && (day<= 20 && month <= 6)) {
		System.out.println("Its a Spring Season!");
		return true;
	}
	else {
		System.out.println("Not a spring season!");
		return true;
	}
		return false;
}
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input month and day
	
        System.out.print("Enter the month :  ");
        double month  = input.nextDouble();
	
	System.out.print("Enter the day :  ");
        double day  = input.nextDouble();

// call the method and pass arguments.
	checkSeason(month,day);
		
        // Close the scanner
        input.close();
    }
}