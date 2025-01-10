import java.util.Scanner;
class Fizzbuzz{
public static void main(String []args){
Scanner scanner = new Scanner(System.in);

    System.out.println("Enter A Number");
// taking number as input
    int num1 = scanner.nextInt();
	 if(num1 % 5==0 && num1 % 3==0 ){
	System.out.println("FizzBuzz");
	 }
	else if (num1 % 3 ==0 ){
	System.out.println("Fizz");
	}
	else if(num1 % 5 ==0){
	System.out.println("Buzz");
	}
	
	}
	else {
	System.out.println("Invalid");
	}
	}
}

