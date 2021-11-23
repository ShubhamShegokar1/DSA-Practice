package practice;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) 
	{
 		System.out.println("Enter k");
	    Scanner sc = new Scanner(System.in);
	    int k = sc.nextInt();
	    
	    int arr[] = null;
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    
	    if(arr.length%k==0)
	    {
	    	System.out.println(true);
	    }else
	    {
	    	System.out.println(false);
	    }
		
	}

}
