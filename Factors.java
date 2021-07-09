package first;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		//getting user input
		System.out.print("Enter number- ");
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		System.out.println("no is-" + getUserInput);
		
		//finding prime factors
		for (int i=2;i<getUserInput;i++) {
			while (getUserInput%i==0) {
				System.out.println("factor is -"+i);
				getUserInput=getUserInput/i;
			}
		}
		
		if(getUserInput>2) {
			System.out.println("factor is - "+getUserInput);
		}
	}
}
