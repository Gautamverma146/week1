public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
	// Initialize counter
        int i = 1;  
// Loop from 1 to 100
        while (i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
				// Print the number if not divisible by 3 or 5
            } else {
                System.out.println(i);  
            }
            i++;  
        }
    }
}
