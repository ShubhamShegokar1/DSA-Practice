package practice3.copy;

import java.util.Scanner;

public class fibonacci 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter N");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int n1=0;
		int n2=1;
		int count=0;
		for(int i=0;i<n;i++)
		{
			  int n3=n1+n2;
			  if(n3==n)
			  {
			  System.out.print(" :"+n3);    
			  }
			  
			 if(n3!=n && n3<n)
			 {
				    count=n3+count;
				    System.out.println("n3  :"+n3);
			 }
			  
			  n1=n2;    
			  n2=n3;   
		}
		   System.out.print(count);

	}
}
