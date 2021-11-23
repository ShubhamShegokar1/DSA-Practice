package practice2;

import java.io.*;
import java.util.*;


public class abc {
	
    public static void main(String[] args) throws IOException
    {
    	
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Test Cases");
    		int T = sc.nextInt();
    		ArrayList <Integer> arr= new ArrayList<Integer>();
    		
    		for(int i=0 ; i<T ; i++)
    		{
    			
    			for(int j=0;j<2;j++)
    			{	
    			arr.add(sc.nextInt());
    			}
    			
    			int m=arr.get(0);
    			int n= arr.get(1);
    			
    			
    			if(n%m==0)
    			{
    				System.out.println("YES");
    			}
    			else
    			{
    				System.out.println("No");
    			}
    		}
    }
}
