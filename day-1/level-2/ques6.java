import java.util.Scanner;
 class ques6 {
        public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
			System.out.println("enter income");
			double income = scanner.nextDouble();
			System.out.println("enter bonus");
			double bonus = scanner.nextDouble();
			double totalincome = income + bonus;
			System.out.println("The salary is INR "+ income + " and bonus is INR "+ " Hence Total Income is INR " + totalincome);
			}
			}