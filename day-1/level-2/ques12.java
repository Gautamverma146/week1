import java.util.Scanner;

 class ques12 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //  enter weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert pounds to kilograms
        double weightInKilograms = weightInPounds / 2.2;

        
        System.out.println("The weight of the person in pounds is " + weightInPounds +
                           " and in kilograms is " + weightInKilograms);

      
    }
}
