import java.util.Scanner;
	class AtheleteRounds{
	 public static double rounds(double perimeter, double side1, double side2, double side3){
	 
	 // 5km = 5000 meter
	 return 5000/perimeter;
	 }
	 
	 public static void main(String []args){
		Scanner input = new Scanner(System.in);
		// User input for all side of triangle
			System.out.println("Enter sides of Triangle");
			
			System.out.println("\nEnter First Side : ");
			double side1 = input.nextDouble();
			
			System.out.println("\nEnter Second Side : ");
			double side2 = input.nextDouble();
		 
			System.out.println("\nEnter Third Side : ");
			double side3 = input.nextDouble();
		double perimeter = side1+side2+side3;
		double totalRounds = rounds(perimeter,side1,side2,side3);
		System.out.println(totalRounds);
		}
		}
		
		
	 
		
		