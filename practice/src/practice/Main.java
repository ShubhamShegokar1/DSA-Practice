package practice;

import java.util.*;

public class Main
{

		public static void main(String args[]) 
		{ 
			int i=0;
			int count=0;
		      System.out.println("Enter size of the array :: ");
		      Scanner sc = new Scanner(System.in);
		      int size = sc.nextInt();
		      int arr[] = new int [size];
		      System.out.print("Enter  elements");
		     try
		     {
		      for( i = 0; i< size; i++) 
		      {
			         arr[i] = sc.nextInt();

		    	  if (arr[i] < (0))
		    	 break;
		    }
		}
            finally		    
           {
           
            	for( i=0;i<arr.length;i++)   
            	{
            		if(arr[i] % 6 == 0 && arr[i]!=0)
                {
                	
            			  count++;
	
            	}

                }
      		  System.out.println("count "+count);


		   }
      }
}