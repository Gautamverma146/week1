import java.util.Scanner;
class ques10{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your hieght");
double heightincm = sc.nextDouble();
double heightininch = heightincm * 0.393701;
double heightinfoot = heightincm / 30.48;
System.out.println("Your Height in cm is " + heightincm + " while in feet is " + heightinfoot + " and inches is " + heightininch);
}
}
