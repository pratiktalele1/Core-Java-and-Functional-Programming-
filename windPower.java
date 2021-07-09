class windChill{  
public static void main(String args[]){  
  	
	//getting input from command line
	double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        
        System.out.println("Temperature is :- " + t);
        System.out.println("Wind speed is :- " + v);
        
	if(t<50&&(v<120&&v>3))
	{
	//formula for calculating wind
	double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	System.out.println("Wind chill :- " + w);
	}else{
		System.out.println("invalid inputs");
	} 
  
}  
} 