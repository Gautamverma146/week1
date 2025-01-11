import java.util.Scanner;

public class TwoDToOneDArray{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter row");
		
		int row = input.nextInt();
		
		System.out.println("Enetr collumn");
		int collumn = input.nextInt();
		
		int [][] twoDArray = new int[row][collumn];
		
		System.out.println("Enter the elements of array");
		 
		 for(int i=0; i<row; i++){
		     for(int j =0; j<collumn;j++){
			 System.out.println("Element ["+ i + "]"+ "[" +j +"]" );
			 twoDArray[i][j] = input.nextInt();
			 }
			 }
			 
			 int[] oneDArray = new int[row * collumn];
			 int index = 0;
			 
			 for(int i=0; i<row;i++){
			    for(int j=0; j<collumn;j++){
                 oneDArray[index]= twoDArray[i][j];         
                     index ++;
                     }
                 }
				 System.out.println("After coping One D array from Two D array\n");
				 
				 for(int i=0; i< oneDArray.length;i++){
				 System.out.print(oneDArray[i] +"");
				 }
				 System.out.println();
				 }
				 }
				 
		
           					 
			
		