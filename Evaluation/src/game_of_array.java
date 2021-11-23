import java.util.*;

public class game_of_array 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int r=sc.nextInt(); 
			int[]arr = new int[n];
			
			for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
      
		 if(r<n)
         {
		   int any=(n-r);
    	   int diff= n-any;
    	   for (int i = n-any; i <n; i++)
			{
   		       System.out.print(arr[i]+" ");
			}   
    	   for (int i = 0; i < diff; i++)
			{
  		       System.out.print(arr[i]+" ");
			}   
    	   
    	   
       }
       else if(r==n)
       {
    	   for (int i = 0; i < n; i++)
			{
    		   System.out.print(arr[i]+" ");
			}      
    	}
       
       else
       {		   
    	   int diff=r%n;
		   int any=n-diff;
    	   for (int i = diff; i <n; i++)
			{
  		       System.out.print(arr[i]+" ");
			}   
   	       for (int i = 0; i < diff; i++)
			{
 		       System.out.print(arr[i]+" ");
			}   
       }
		
    }
}
