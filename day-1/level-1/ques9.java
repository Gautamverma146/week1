import java.util.Scanner;
class ques9{
public static void main(String []args){ 
Scanner sc = new Scanner(System.in);
System.out.println("Enter course fee");
double coursefee = sc.nextDouble();
System.out.println("Enter discount percent");

double discount = sc.nextDouble();
double discoutamount = coursefee*discount/100;
double discountfee = coursefee-discoutamount;
System.out.println("The discount amount is INR " + discoutamount + " and final discounted fee is INR "+ discountfee  );
}
}