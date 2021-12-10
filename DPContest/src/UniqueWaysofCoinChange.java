import java.util.Arrays;
import java.util.Scanner;

public class UniqueWaysofCoinChange {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		long arr[]= new long[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextLong();
		}
		Arrays.sort(arr);
		long dp[]= new long[k+1];
		dp[0]=1;
		for(int i=0;i<n;i++) 
		{
			for(long j=arr[i];j<dp.length;j++) 
			{
				dp[(int) j]+=dp[(int) (j-arr[i])];
			}
//			
//			for(int j=0;j<k+1;j++) 
//			{
//				System.out.print(dp[j]+" ");
//			}
		}
		System.out.println(dp[k]);

	}

	
}
