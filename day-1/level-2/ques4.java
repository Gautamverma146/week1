import java.util.Scanner;

 class ques4 {
        public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
			System.out.println("Enter temperature");
			//taking input in double datatype
			double celsius = scanner.nextDouble();
			double fehrenite =  (celsius * 9/5) + 32;
			System.out.println("The "+ celsius + " Celsius" + "is " + fehrenite + " fehrenite");
			}
			}
			
			
