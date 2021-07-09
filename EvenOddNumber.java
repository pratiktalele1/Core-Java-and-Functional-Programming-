package first;

import java.util.Scanner;


public class EvenOddNumber {
	public static void main(String[] args) {
		//getting input from user
		System.out.print("Enter number- ");
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		
		//checking condition for even or odd
		String result=(getUserInput%2==0)?"- even number":"- odd number";
		System.out.println(getUserInput+" "+result);
	}
}
