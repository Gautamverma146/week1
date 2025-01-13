import java.util.*;

public class SubstringCreation {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String :");
        String text = sc.next();
        // user input for start and end indexes
        System.out.println("Enter Start index");
        int start = sc.nextInt();
        System.out.println("Enter End index");
        int end = sc.nextInt();

    String usingBuiltIn = text.substring(start,end);



    }
}
