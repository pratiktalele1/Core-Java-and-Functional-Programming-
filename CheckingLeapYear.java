package first;

import java.util.Scanner;

public class CheckingLeapYear {
	public static void main(String[] args) {
			
		  //initilazing variables
		  int year,count=0;
	      System.out.println("Enter an Year -");
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b=a;
	      
	      //checking for valid year
	      while (a != 0) 
		    {
		      a /= 10;
		      ++count;
		    }

	      //checking for leap year or not
	      if (((b % 4 == 0) && (b % 100!= 0)) || (b%400 == 0))
	         System.out.println(" leap year");
	      else
	         System.out.println("not a leap year");

	}
	}

