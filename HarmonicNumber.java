package first;
import java.util.Scanner;


public class HarmonicNumber {
	public static void main(String[] args) {
		double harmonicNumber=1.0;
		//getting user input
		System.out.print("Enter Nth number- ");
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		
		System.out.println("no is-" + getUserInput);
		//calculating harmonic number
		for (double i=2;i<=getUserInput;i++) {
			harmonicNumber=harmonicNumber+(1/i);
		}
		
		System.out.println(" Nth harmonic number is - "+harmonicNumber);
		
	}
}
