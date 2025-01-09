import java.util.Scanner;
class ques12{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Base of triangle");
double base = sc.nextDouble();
System.out.println("Enter Height of triangle");
double height = sc.nextDouble();
double area = base * height * 1/2;
System.out.println("height of triangle is " + height + " and base is " + base + "\n and area of triangle is " + area  );
}
}
