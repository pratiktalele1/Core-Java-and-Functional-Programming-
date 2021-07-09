package first;

import java.util.Scanner;

public class VowelOrConsonent {
	public static void main(String[] args) {
		//getting input from user
		System.out.print("Enter only alphabet - ");
		Scanner scanInput = new Scanner(System.in);
		char getUserInput = scanInput.next().charAt(0);
		
		//condition for checking vowels
		if( getUserInput == 'a'|| getUserInput == 'e'|| getUserInput == 'i' || getUserInput == 'o'|| getUserInput == 'u') {
			System.out.println(getUserInput+" - is a vowel");
		}else {
			System.out.println(getUserInput+" - is a consonent");
		}
		
	}
}
