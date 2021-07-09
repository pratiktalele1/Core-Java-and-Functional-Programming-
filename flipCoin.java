package first;

import java.util.Scanner;



public class flipCoin {
	public static void main(String[] args) {
		
		//initilazing variables
		double option;
		double headCount=0;
		double tailCount=0;
		
		//getting user input for number of times
		System.out.print("Enter number of times you have to flip- ");
		Scanner scanInput = new Scanner(System.in);
		int userInput = scanInput.nextInt();
		
		//checking for head and tail count
		for (int i=0;i<userInput;i++)
		{
			option=Math.floor((Math.random()*2));
			//System.out.println(option);
			if(option==0.0) {
				headCount++;
			}
			else {
				tailCount++;
			}
		}
		
		//finding percentage
		System.out.println("heads repeats - " +headCount+" times");
		System.out.println("tails repeats - "+tailCount+" times");
		double percentage = (float)((headCount / userInput) * 100);
	    System.out.println("Percentage ::"+ percentage+" %");
	    double percentageTail = (float)((tailCount / userInput) * 100);
	     System.out.println("Percentage ::"+ percentageTail+" %");
		
  
		  
	}
}
