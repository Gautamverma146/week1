import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
		
		
		
		 int[] numbers = new int[5];
		 
		 for(int i=0; i< numbers.length; i++ ){
		 System.out.println("Enter number :"+(i+1)+ ".");
		  numbers[i] = scanner.nextInt();
		 }
		 System.out.println("NumberAnalysis:");
		 
		 // check if number is positive, negative, or zero
		 
		 for(int i=0; i< numbers.length;i++){
		 int num = numbers[i];
		  
		  //check if number is positive
		  
		  if(num>0){
		  if(num%2 ==0){
		  System.out.println("Number"+num+ " is positive and Even. ");
		  }
		  else{
		  System.out.println("Number"+num+ " is positive and odd. ");
		  }
		  }
		  else if (num<0){
		  System.out.println("Number"+num+ " is negative. ");
		  }
		  else {
		  System.out.println("Number"+num+ " is zero. ");
		  }
		  }
		  
		  //comparing the first and last elements
		  
		  int first = numbers[0];
		  int last = numbers[numbers.length-1];
		  System.out.println("comparing first and last elements ");
		  if (first == last){
		  System.out.println("The First and last numbers are equal ");
		  }
		else if(first < last){
		System.out.println("First number is smaller then last ");
		}
		else{
		System.out.println("First number is greater than last ");
		}
		}
		}
		