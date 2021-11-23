import java.util.Arrays;
import java.util.Scanner;

class betteravg
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
		int n=sc.nextInt();
		int[]arr = new int[n];
		int []arr1=new int[n];

		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();	
		}
		for (int i = 0; i < n; i++)
		{
			arr1[i] = sc.nextInt();	
		}
		int cnt=0;
		for (int i = 0; i < n; i++)
		{
			cnt=cnt+arr[i];	
		}
		cnt=cnt/n;
		int cnt2=0;
		for (int i = 0; i < n; i++)
		{
			cnt2=cnt2+arr1[i];			
			
		}
		
		cnt2=cnt2/n;
		
		if(cnt<=cnt2 && cnt2%2==0 )
		{
			System.out.print(cnt2);
		}
		else
		{
			System.out.print(-1);
		}
	}
}