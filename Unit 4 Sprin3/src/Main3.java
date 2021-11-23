import java.util.Arrays;
import java.util.Scanner;
public class Main3 
{
	
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
      int test=sc.nextInt();
      for(int i=0;i<test;i++)
      {
    	  int n=sc.nextInt();
    	  int arr[]= new int[n];
    	  for(int j=0;j<n;j++)
    	  {
    		  arr[j]=sc.nextInt();
    	  }
    	  int count[]= new int[100000];
    	   if(arr.length==1)
    	   {
    		   System.out.println(arr[0]);
    	   }
    	   else {
    		   for(int k=0;k<n;k++)
    		   {
    			   count[arr[k]]++;
    		   }
    		   for(int k=0;k<count.length;k++)
    		   {
    			   if(count[k]==1)
    			   {
    				   System.out.println(k);
    			   }
    		   }
    	   }
    	

      }
	}
}
