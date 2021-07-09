package first;

import java.util.Scanner;

public class UtilityForInputNumber {
	
	//getting user input
	public static double input() {
		System.out.println("Enter number- ");
		Scanner scanInput = new Scanner(System.in);
		double getUserInput = scanInput.nextDouble();
		return getUserInput;
	}
	
	//calculating root for the equation
	public static void quadraticRoots(Double a,Double b,Double c) {
		
		double delta=(b*b)-(4*a*c);
		System.out.println(delta);
		if(delta>0) {
			delta=Math.sqrt(delta);
			System.out.println("Root +X1 is :"+((-b+delta))/(2*a));
			System.out.println("Root -X2 is :"+((-b-delta))/(2*a));
		}else {
			System.out.println("imaginary roots");
		}
		
	
	}
}
 