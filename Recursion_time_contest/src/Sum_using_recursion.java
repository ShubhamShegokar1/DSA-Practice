import java.util.Scanner;
public class Sum_using_recursion 
{
	static void sum (int cnt, int n,int arr[])
	{
		 if(n>0)
		 {
			int add=arr[n]-arr[n-1];
			if(add<0)
			{
				add=add*-1;
			}
			cnt=cnt+add;
			n--;
			sum(cnt, n, arr);
		 }
		 else
		 {
			 System.out.println(cnt);
		 }
		 
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int cnt=0;
			int n=sc.nextInt();
			int arr[]= new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=sc.nextInt();
			}
			sum(cnt,n-1,arr);
		}
		
	}
}