import java.util.Scanner;
 class ques6 {
        public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
			System.out.println("Enter First Number");
			//taking input by user
			int number1= scanner.nextInt();
			System.out.println("Enter Second Number");
			int number2 = scanner.nextInt();
			int swapped = number1;
			number1=number2;
			number2=swapped;
			System.out.println(" The swapped numbers are "+number1+ " and " + number2 );
			}
			}
			
			
			