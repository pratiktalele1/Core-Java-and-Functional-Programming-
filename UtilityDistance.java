package first;

public class UtilityDistance {
	
	public static void euclideanDistance(int pointX1,int pointX2,int pointY1,int pointY2) {
		//calculating Euclidean distance
		System.out.println("Euclidean distance is -"+
				Math.sqrt(
				Math.pow(pointX2-pointX1, 2)
				+
				Math.pow(pointY2-pointY1,2)
				)
				);
	}
	
}
