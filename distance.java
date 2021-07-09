package first;

import first.UtilityForSwapNumber;
public class distance {
	
	public static void main(String[] args) {
		
		System.out.println("point x1");
		//getting input for point X1
		int pointX1=UtilityForSwapNumber.getInput();
		
		System.out.println("point x2");
		//getting input for point X2
		int pointX2=UtilityForSwapNumber.getInput();
		
		System.out.println("point y1");
		//getting input for point y1
		int pointY1=UtilityForSwapNumber.getInput();
		
		System.out.println("point y2");
		//getting input for point y2
		int pointY2=UtilityForSwapNumber.getInput();
		UtilityDistance.euclideanDistance(pointX1, pointX2, pointY1, pointY2);
		
	}
}
