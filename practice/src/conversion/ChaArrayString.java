package conversion;

import java.util.Scanner;

public class ChaArrayString
{
	   public static void main(String args[])
	   {
	      Scanner s = new Scanner(System.in);
	      System.out.println("First add some characters...");
	      
	      char[] a = s.next().toCharArray();
	      	      
	       String str=String.valueOf(a);
	      
	     System.out.println(a); 
	      
	   }
}
	
	
	

