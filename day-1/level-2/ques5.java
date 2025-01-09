import java.util.Scanner;
 class ques5 {
        public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
			System.out.println("Enter temperature");
			//taking input in double datatype
			double fehrenite = scanner.nextDouble();
			double celsius =   (fehrenite - 32)*5/9;
			System.out.println("The "+ fehrenite + " fehrenite" + "is " + celsius + " celsius");
			}
			}