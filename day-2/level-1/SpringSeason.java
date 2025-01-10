
public class SpringSeason {
    public static void main(String[] args) {
        // Step 1: Check if the command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide two command-line arguments: month and day.");
            return; // Exit the program if arguments are missing
        }

        // Step 2: Get the month and day from the command-line arguments
        try {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);

            // Step 3: Check if the date falls within the spring season (March 20 to June 20)
            if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers for month and day.");
        }
    }
}

