public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;  // Initializing text to null
        System.out.println("Attempting to call length() on a null string...");
        // This will generate NullPointerException
        int length = text.length();  // NullPointerException occurs here
    }

    // Method to demonstrate NullPointerException handling
    public static void demonstrateNullPointerExceptionHandling() {
        String text = null;  // Initializing text to null
        try {
            System.out.println("Attempting to call length() on a null string...");
            int length = text.length();  // NullPointerException occurs here
        } catch (NullPointerException e) {
            // Handling the exception
            System.out.println("Caught NullPointerException: Cannot call method on a null reference.");
        }
    }

    public static void main(String[] args) {
        // 1. Calling the method to generate NullPointerException
        System.out.println("Demonstrating NullPointerException without handling:");
        generateNullPointerException();  // This will terminate the program

        // 2. Refactored code to handle the exception
        System.out.println("\nDemonstrating NullPointerException with handling:");
        demonstrateNullPointerExceptionHandling();  // This will catch and handle the exception
    }
}
