import java.util.Scanner;

public class Ride 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();

		for(int l=0;l<test;l++)
		{
			int n=sc.nextInt();
			int arr[]= new int[n];

			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int cnt=0;
			int ans=0;
			while(cnt<n-1)
			{
				while(cnt<n-1 && arr[cnt]<arr[cnt+1]  )
				{
					cnt++;
					
				}
				ans++;
				cnt++;
			}
			if(arr[n-2]>=arr[n-1])
			{
				ans++;
			}
			System.out.println(ans);
			
		}
	}
}
