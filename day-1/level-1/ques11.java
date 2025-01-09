import java.util.Scanner;
class ques11{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number");
double num1 = sc.nextDouble();
System.out.println("Enter Scond Number");
double num2 = sc.nextDouble();
double add = num1 + num2;
double sub = num1 - num2;
double multiply = num1 * num2;
double divide = num1 / num2;
System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + add + sub + multiply + " and " + divide );
}
}
