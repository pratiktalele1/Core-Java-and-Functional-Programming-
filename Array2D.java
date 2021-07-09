package first;

import java.util.Scanner;
import first.UtilityForSwapNumber;

public class Array2D {
	
	//creating global variable
	static int[][]  array2D=new int[100][100];
	static int getRows=0;
	static int getColumn=0;
	
	public static void getElement() {
		//storing elements into array
		for (int i=0;i<getRows;i++) {
			for(int j=0;j<getColumn;j++) {
				array2D[i][j]=scanInput.nextInt();
			}
		}
	}
	
	public static void printElement() {
		//printing elements
				System.out.println("----------------------------------------------");
				System.out.println("printing array elements");
				for (int i=0;i<getRows;i++) {
					for(int j=0;j<getColumn;j++) {
						System.out.print(array2D[i][j] + "\t");
						}
					 System.out.println();
				}
				System.out.println("----------------------------------------------");
				
	}
	
	static Scanner scanInput = new Scanner(System.in);
	public static void main(String[] args) {
		
		//getting number of column
		System.out.println("number of column ");
		getColumn=UtilityForSwapNumber.getInput();
		
		System.out.println("----------------------------------------------");
		//getting number of rows
		System.out.println("number of rows ");
		getRows=UtilityForSwapNumber.getInput();
		
		System.out.println("----------------------------------------------");
		
		System.out.println("enter number -");
		//calling function for storing and printing array
		getElement();
		printElement();
		
	}
}
