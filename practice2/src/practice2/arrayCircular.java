package practice2;

import java.util.Scanner;

class arrayCircular {

	    public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int N = sc.nextInt();         // 5

		int K = sc.nextInt();          // 2
		int arr[] = new int[N * 2];
            int j=0;
            int i=0;

		      // --------- input
		
		try
		{
			for ( i = 0; i < N; i++) 
			{
				arr[i] = sc.nextInt();
			}
			
			//------logic 
			
			for ( i = 5; i < (N * 2); i++) 
			{
				arr[i]=arr[j];
                j=j+1;
			}
			
			  
			for (int z=(5-K);  z <= (arr.length-K-1) ; z++) 
			{
				System.out.print(arr[z] + " ");
			}
				
		}
		
		
		catch(Exception e)
		{			
			
		}
		
	}
}
