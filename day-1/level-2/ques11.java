import java.util.Scanner;

 class ques11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    //  Principal amount
     System.out.print("Enter the Principal amount: ");
    double principal = scanner.nextDouble();

    //  Rate of Interest
     System.out.print("Enter the Rate of Interest (in %): ");
     double rate = scanner.nextDouble();

        //  Time in years
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

       
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal +
                           ", Rate of Interest " + rate + "%, and Time " + time + " years.");

        
  
    }
}
