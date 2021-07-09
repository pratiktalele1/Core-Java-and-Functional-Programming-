package first;

import java.util.Scanner;
import first.UtilityForSwapNumber;
public class SwapTwoNumber {
	public static void main(String[] args) {
		double firstNumber=0;
		double secondNumber=0;
		
		//getting user input
		firstNumber=UtilityForSwapNumber.getInput();
		secondNumber=UtilityForSwapNumber.getInput();
		
		//printing user input before swaping
		System.out.println("first number before swap is - "+firstNumber);
		System.out.println("second number before swap is - "+secondNumber);
		
		//condition for swaping
		firstNumber=firstNumber+secondNumber;
		secondNumber=firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		
		//printing user input after swaping
		System.out.println("first number after swap is - "+firstNumber);
		System.out.println("second number after swap is - "+secondNumber);
		
		
	}
}
