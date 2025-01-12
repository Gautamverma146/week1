
import java.util.Scanner;

public class  NumberCheck {


	public static void checknumber(double number){
	    
	if(n > 0) {
		System.out.println("1");
	}
	else if(n<0){	
		System.out.println("-1");	
	}
	else {
		System.out.println("0");
	}

	}


	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input number
	
        System.out.print("Enter the number :  ");
        double number  = input.nextDouble();
	
		
        // call the methods
	
	checknumber(number);

 	
       
    }
}