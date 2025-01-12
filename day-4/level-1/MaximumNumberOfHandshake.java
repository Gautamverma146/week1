import java.util.Scanner;

public class MaximumNumberOfHandshake {

 // Method to calculate find the maximum number of handshakes among N number of students.

     		public static int handShakes(int numberOfStudents) {
        return (numberOfStudents*(numberOfStudents-1))/2;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for user input for principal, rate, time


        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        


        // Calling methods to calculate maximum number of handshakes
        int numberOfHandshakes = handShakes(numberOfStudents);
      

        // DDisplay the number of possible handshakes
        System.out.println("The possible handshakes are : "+ numberOfHandshakes); 


	input.close();
    }
}
