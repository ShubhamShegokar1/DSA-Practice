 import java.util.Scanner;
class product_of_array
{	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	 
	for (int l = 0; l < T; l++) 
	{
       int n=sc.nextInt();
		int[]arr = new int[n];

       for (int i = 0; i < n; i++)
		{
				arr[i] = sc.nextInt();	
		}
      int cnt=1;
       for(int i=0;i<n;i++)
       { 
    	   cnt=1;
    	   for(int j=0;j<n;j++)
    	   {
    		   if(i!=j)
    		   {
    		   cnt=arr[j]*cnt;
    		   }
    		   if(j==n-1)
    		   {
        		   System.out.print(cnt+" ");

    		   }
    	   }

       }
		System.out.println();
    }
  }
}