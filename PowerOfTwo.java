class powerTwo{  
public static void main(String args[]){  
  	
	 int userInput = Integer.parseInt(args[0]);

        int i = 0;                
        int powerOfTwo = 1;       

	
        while (i <= userInput) {
	    if(i<31)
	    {
            System.out.println(i + " " + powerOfTwo);   
	    powerOfTwo = 2 * powerOfTwo;                
            i++;
	    }
        }  
}  
} 