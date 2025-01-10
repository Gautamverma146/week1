import java.util.Scanner;

public class VotingEligibilityCheck {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
		
		//array to store age of 10 students
		
		 int[] studentAge = new int[10];
		 
		 //take input for student Age
		 
		 for (int i = 0; i < studentAge.length; i++){
		 System.out.println("Enter Age of Student:"+ (i+1) +":");
		 
		 studentAge[i] = scanner.nextInt();
		 }
		 System.out.println("\nVoting Eligibility Check:");
		 
		 for (int i =0; i < studentAge.length; i++){
		 
		 int age = studentAge[i];
		 //checking if age is inputed invalid
		 if (age <= 0){
		 System.out.println("Invalid age for Student:"+(i+1)+".");
		 }
		 else if( age >=18){
		 System.out.println("The student with the age "+age+ " can vote.");
		 }
		  else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
		 }
		 }
		 }
		 
