import java.util.Scanner;
class ques10{
public static void main(String []args){
Scanner scanner= new Scanner(System.in);
System.out.println("Enter number of chocolates");

int N = scanner.nextInt();
System.out.println("Enter number of Children");
int M = scanner.nextInt();
int maxchocolate = N/M;
int remainingchocolate = N%M;
System.out.println("The number of chocolates each child gets is "+  maxchocolate + " and the number of remaining chocolates are " + remainingchocolate);
}
}

