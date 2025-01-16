import java.util.Scanner;

public class FindStringLength {

    // Method to find string length without using length() method, using for loop
    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;

        // Using a for loop to iterate over the string
        try {
			// Infinite loop
            for (int i = 0; ; i++) {  
                str.charAt(i);  
				 // Increment count if character exist
                count++;       
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length
            return count;  // Exit the loop when the end of the string is reached
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
		// Allows multi-word input
        String userInput = sc.nextLine();  

        // Finding length using custom method
        int customLength = findLengthWithoutLengthMethod(userInput);

        // Finding length using built-in length() method
        int builtInLength = userInput.length();

        // Displaying results
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);

        
    }
}
