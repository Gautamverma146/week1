import java.util.Scanner;
class ques16 {
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no. of student");
int students = sc.nextInt();
int maxhandshake = (students * (students - 1)) / 2;
System.out.println("Number of student" + students + " Maximum possible handshake " + maxhandshake);
}
}
