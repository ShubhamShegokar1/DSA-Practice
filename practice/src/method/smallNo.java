package method;

import java.util.*;
public class smallNo {
    static int n=3;
	public static int smallestno()
	{  
		Scanner sc = new Scanner(System.in)	;
		
		for(int i = 0;i<n;i++)
		{
			
		 System.out.println("Enter "+i+" element");
		}
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		if(a>b && a>c)
		{
			System.out.println("Largest is"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Largest is"+b);
		}
		else
			System.out.println("Largest is "+c);
		return 0;		
	
	}
	
	
	
	public static void main(String[] args) 
	{
       smallNo.smallestno();
       
	}

}
