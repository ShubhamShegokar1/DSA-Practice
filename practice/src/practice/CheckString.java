package practice;


// Check if a string contains only alphabets in Java using ASCII values

import java.util.Scanner;

public class CheckString {

	public static void main(String[] args) 
	{
       
       System.out.println("Enter String");
       Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   while(true)
	   {
	    if(str.length()==1)
	    {
	  
	    System.out.println("String has onl 1 alphabet");
	    }	   
	    else
	    {
	    	System.out.println("No string has more alphabets");
	    }
	   }
	}

}
