package first;

import first.UtilityForSwapNumber;
import java.util.Scanner;
public class LargestAmongThreeNumbers {
	public static void main(String[] args) {
		//initializing variable
		double firstNumber=0;
		double seconNumber=0;
		double thirdNumber=0;
		
		//getting user input
		firstNumber=UtilityForSwapNumber.getInput();
		seconNumber=UtilityForSwapNumber.getInput();
		thirdNumber=UtilityForSwapNumber.getInput();
		
		//printing user input
		System.out.println(firstNumber+" - is a 1 number ");
		System.out.println(seconNumber+" - is a 2 number ");
		System.out.println(thirdNumber+" - is a 3 number ");
		
		//checking for greater condition
		if(firstNumber>seconNumber&&firstNumber>thirdNumber) {
			System.out.println(firstNumber+" - is great among 3 number");
		}else if(seconNumber>firstNumber&&seconNumber>thirdNumber) {
			System.out.println(seconNumber+" - is great among 3 number");
		}else if(thirdNumber>firstNumber&&thirdNumber>seconNumber){
			System.out.println(thirdNumber+" - is great among 3 number");
		}
		
		else if(firstNumber==seconNumber||firstNumber==thirdNumber||seconNumber==firstNumber||seconNumber==thirdNumber||thirdNumber==firstNumber||thirdNumber==seconNumber){
			System.out.println("you enter 2 similer number");
		}
		
		
	}
}
