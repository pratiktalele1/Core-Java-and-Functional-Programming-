package first;

public class QuadraticEquation {
	public static void main(String[] args) {
		
		//initializing variables 
		double a=0;
		double b=0;
		double c=0;
		
		System.out.println("give the input for equation ax2+bx+c -");
		//getting input from user
		a=UtilityForInputNumber.input();
		b=UtilityForInputNumber.input();
		c=UtilityForInputNumber.input();
		//calculating roots 
		UtilityForInputNumber.quadraticRoots(a, b, c);
		
	}
}
