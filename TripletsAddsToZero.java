package first;

import java.util.Scanner;
import first.UtilityForSwapNumber;
import first.UtilityForTriplet;
public class TripletsAddsToZero {
	
	 static int getUser;
	
	public static void main(String[] args) {
		
		//getting user input for array range
		getUser=UtilityForSwapNumber.getInput();
		
		//storing elements to array
		UtilityForTriplet.getElementForArray(getUser);
		
		System.out.println("user inputs are -");
		//printing elements from array
		UtilityForTriplet.printElementForArray(getUser);
		
		System.out.println("----------------------------------");
		System.out.println("triplets are");
		//checking for triplet condition
		UtilityForTriplet.checkForTriplet(getUser);
		System.out.println("----------------------------------");

		
	}
}
