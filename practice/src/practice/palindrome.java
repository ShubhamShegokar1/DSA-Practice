package practice;

import java.util.*;

public class palindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String str= String.valueOf(n);
	    String str2=str;
	    int length=str.length();
	    int count=0;
	    for(int i=0;i<length;i++)
	    {
	    	for(int j=length-1;j>-1;j--)
	    	{
	    		if(str.charAt(i)==str2.charAt(j));
	    		{
	    			count++;
	    		}
	    	}
	    	
	    }
	   if(count==length*length)
	   {
		   System.out.println("Yes");
	   }else
	   {
		   System.out.println("No");
	   }
    }
     
}


