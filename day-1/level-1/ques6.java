class ques6{
public static void main(String []args){ 
double coursefee = 125000;
double discount = 10;
double discoutamount = coursefee*discount/100;
double discountfee = coursefee-discoutamount;
System.out.println("The discount amount is INR " + discoutamount + " and final discounted fee is INR "+ discountfee  );
}
}