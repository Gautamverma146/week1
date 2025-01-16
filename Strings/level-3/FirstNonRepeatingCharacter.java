import java.util.*;

public class FirstNonRepeatingCharacter {
//Method for First non repeating character
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] freq = new int[256];  

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return ' ';  
    }
// main 
    public static void main(String[] args) {
		//input method 
        Scanner sc = new Scanner(System.in);
//taking input string from  user 
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingCharacter(text);
//displaying result 
        if (result == ' ') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }
//closing input
        sc.close();
    }
}
