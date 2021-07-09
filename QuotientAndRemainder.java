package first;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		//getting user input for Dividend
		System.out.print("Enter Dividend number- ");
		Scanner scanInput = new Scanner(System.in);
		int getUserInputDividend = scanInput.nextInt();
		
		//getting user input for Divisor
		System.out.print("Enter Divisor number- ");
		Scanner scanInput2 = new Scanner(System.in);
		int getUserInputDivisor = scanInput2.nextInt();
		
		//calculating Quotient
		System.out.println("Quotient is - "+(getUserInputDividend/getUserInputDivisor));
		//calculating Remainder
		System.out.println("Remainder is - "+(getUserInputDividend%getUserInputDivisor));
		
	}
}
