import java.util.Arrays;
import java.util.Scanner;

public class NumberOfSegmentsWithGoodSum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++)
		{
			int n = sc.nextInt();
			long k=sc.nextLong();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				arr[i] = sc.nextInt();
			}
			
			int i=0;
			int j=0;
			long cnt=0;
			long temp=arr[i];
			while(i<n && j<n)
			{
				if(temp<=k) 
				{
					j++;
					if(j>=i) 
					{
						cnt+=j-i;
					}
					
					if(j<n) 
					{
						temp+=arr[j];
					}
				}
				else 
				{
					temp-=arr[i];
					i++;
				}
				
			}
			System.out.println(cnt);
			
		}
	}
}
