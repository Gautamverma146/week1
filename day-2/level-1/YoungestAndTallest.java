import java.util.Scanner;
    public class YoungestAndTallest{
	  public static void main(String []args){
	    Scanner input = new Scanner(System.in);
		  
		  String[] friends =  {"Amar","Akbar","Anthony"};
		  int[] ages = new int[3];
		  double[] height = new double[3];
		  
		  for(int i=0;i <3;i++){
			System.out.println("Enter details of"+ friends[i]+":");
			System.out.println("Enter Age :");
				//taking input ages
				ages[i] = input.nextInt();
				
				if (ages[i]<=0){
				System.out.println("Invalid age! Please enter a positive age");
				i--;
				continue;
				}
				//input height
				System.out.println("Enter Height of "+ friends[i]+" :");
				height[i] = input.nextDouble();
				if(height[i]<=0){
				System.out.println("Invalid Height! Please Enter valid Height");
				i--;
				}
		     int youngestIndex =0;
			  for(int i =1; i<3; i++){
				if(ages[i]< ages[youngestIndex]){
					youngestIndex =i;
					}
					}
			 int tallestIndex = 0;
				for(int i =1;i<3;i++){
					if(height[i]>height[tallestIndex]){
						tallestIndex =i;
						}
						}
			System.out.println("\n------Result------");
		    System.out.println("The Youngest Friend is "+ friends[youngestIndex] + " with age "+ ages[youngestIndex]+ " years");
			 System.out.println("The Tallest Friend is "+ friends[tallestIndex] + " with age "+ height[tallestIndex]+ " Height");
				
		  }
		  }
		  }
		  