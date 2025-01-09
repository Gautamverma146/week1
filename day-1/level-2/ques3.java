import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
 System.out.println("enter first number");
 double a = sc.nextDouble();
  System.out.println("enter second number");
 double  b= sc.nextDouble();
  System.out.println("enter third number");
 double c = sc.nextDouble();
  double operation1 = a + b *c;
  double operation2 = a * b + c;
  double operation3 = c + a / b;
  double operation4 = a % b + c;
  
  System.out.println("The results of Int Operations are " + operation1 + ", " + operation2 +"," + operation3 + "and " + operation4);
  }
  }
  