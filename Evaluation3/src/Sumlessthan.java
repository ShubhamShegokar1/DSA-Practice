import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Sumlessthan
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		int t=sc.nextInt();
		for (int l = 0; l < t; l++)
		{
			ArrayList <Integer> list= new ArrayList<>();
		int n=sc.nextInt();
		int[]arr = new int[n];
		 
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();	
		}
		
		int ans=0;
		int k=sc.nextInt();
	     for(int j=0;j<n;j++)
	     {    		
	 		 boolean b= true;
	    	 for(int i=2;i<=arr[j]/2;i++)
	    	 {
	    		 int temp=arr[j]%i;
	    		 if(temp==0 )
	    		 {
	    			 b=false;
	    			 break;
	    		 }
	    	 }
	    	 if( arr[j]!=1 && b==true)
	    	 {
	    		 list.add(arr[j]);
	    	 }
	     }
	    
	    for(int i=0;i<list.size();i++)
	    {
	    	if(list.get(i)<k)
	    	{
	    		ans=list.get(i)+ans;
	    	}
	    }
	     System.out.println(ans); 
		}
	}
}