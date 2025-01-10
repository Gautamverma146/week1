import java.util.Scanner;
 class PrimeNoCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number to check if it's a prime number: ");
        int number = scanner.nextInt();
// Initialize as true
        boolean isPrime = true;  

        // Prime number check
        if (number <= 1) {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;  // Number is divisible by another number
                    break;  // Exit loop early if not prime
                }
            }
        }

        
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        
    }
}
