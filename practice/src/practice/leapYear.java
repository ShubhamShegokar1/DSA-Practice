package practice;

import java.util.Scanner;

public class leapYear {

	static boolean isleap=false;
	static public void method(int year )
	{
	  if(year%4==0)
	  {
		  if(year%100==0)
		  {
			  if(year%400==0)
			  {
				  isleap=true;
			  }
			  else
				  isleap=false;

		  }
		  else
			  isleap=false;
			  
	  }else
		  isleap=true;
		
	  if(isleap==true)
          System.out.println(year + " is a Leap Year.");
      else
          System.out.println(year + " is not a Leap Year.");
  
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter YEar");
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        leapYear.method(year);
	}

}
