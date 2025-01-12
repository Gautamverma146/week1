import java.util.Scanner;

public class MaxHandshakes {

 // Method to calculate find the maximum number of handshakes among N number of students.

     		public static int handShakes(int students) {
        return (students*(students-1))/2;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for user input for principal, rate, time


        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        


        // Calling methods to calculate maximum number of handshakes
        int numberOfHandshakes = handShakes(students);
      

        // Displaying the results
        System.out.println("The possible handshakes are : "+ numberOfHandshakes); 


	input.close();
    }
}
