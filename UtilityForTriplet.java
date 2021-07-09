package first;

public class UtilityForTriplet {
	
	static int[] array=new int[100];
	static int getUser;
	public static void getElementForArray(int getUser) {
		for(int i=0;i<getUser;i++) {			
			//storing elements to array
			array[i] = 	UtilityForSwapNumber.getInput();
		}
	}
	
	public static void printElementForArray(int getUser) {
		for(int i=0;i<getUser;i++) {
			//printing elements from array
			System.out.print(array[i]+"\n");			
		}
	}
	
	public static void checkForTriplet(int n) {
		//conditions for triplets
		int count=0;
		for (int i=0; i<n-2; i++)
	    {
	        for (int j=i+1; j<n-1; j++)
	        {
	            for (int k=j+1; k<n; k++)
	            {
	                if (array[i]+array[j]+array[k] == 0)
	                {
	                	count++;
	                    System.out.println(array[i]+" "+array[j]+" "+array[k]);
	                }
	            }
	        }
	    }
			System.out.println("total numbers of triplets are :-"+count);
	}
}
