import java.util.Scanner;
	public class SumOfNaturalNumber{
		public static int naturalNumber(int number){
		int sum = 0;
			for (int i =0; i<=number; i++){
			  sum +=i;
			  }
			  return sum;
			  }
	public static void main(String []args){
		// input object for iput 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Natural Number : ");
		
		int number =input.nextInt();
		//check if number is invalid or non natural
		if (number<0){
			System.out.println("Invalid number! Please Enter positive integer");
			
		}
		else {
			//calling method for calculating sum of natural numbers
			int sum = naturalNumber(number);
			System.out.println("The sum of the first "+ number + " Natrual number is : "+ sum);
		}
		
		  }
		  }
		  