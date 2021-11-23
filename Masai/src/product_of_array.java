import java.util.*;
class product_of_array
{	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	 
	for (int l = 0; l < T; l++) 
	{

		int n = sc.nextInt();
		int[]arr = new int[n];
		int[]left = new int[n];
		int[]right = new int[n];

		
		for (int i = 0; i < n; i++)
		{
				arr[i] = sc.nextInt();	
		}
		
		//--------------------------------------------
		
	    left[0]=arr[0];
		
	    for(int i=1;i<n;i++)
		{
	       left[i]=arr[i]*left[i-1];  	  
	    //  System.out.print(left[i]+" ");
		}
	//	System.out.println();
		
		//--------------------------------------
	    right[n-1]=arr[n-1];		
	    for(int i=n-2;i>=0;i--)
		{
	       
			right[i]=arr[i]*right[i+1];
		   // System.out.print(right[i]+" ");

		}
		//System.out.println();
		
	    
	    
	    for(int i=0;i<n;i++)
	    {
	    //	System.out.print(left[i]+" ");
	    }
	    
	    //System.out.println();
	    
	    for(int i=0;i<n;i++)
	    {
	    	//System.out.print(right[i]+" ");
	    }
	  //  System.out.println();
	    
		//-----------------------------------
		System.out.print(right[1]+" ");
		
		for(int i=1;i<n-1;i++)
		{
			System.out.print(left[i-1]*right[i+1]+" ");
		}
           
		  System.out.print(left[n-2]+" ");
           System.out.println();		
	}

  }  
}

