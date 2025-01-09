import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
 System.out.println("enter first number");
 int a = sc.nextInt();
  System.out.println("enter second number");
 int  b= sc.nextInt();
  System.out.println("enter third number");
 int c = sc.nextInt();
  int operation1 = a + b *c;
  int operation2 = a * b + c;
  int operation3 = c + a / b;
  int operation4 = a % b + c;
  
  System.out.println("The results of Int Operations are " + operation1 + ", " + operation2 +"," + operation3 + "and " + operation4);
  }
  }
  