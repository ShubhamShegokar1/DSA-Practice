import java.util.Scanner;
import java.util.Stack;
public class Masai 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int j=0;j<n-1;j++)
		{
			int greater=0;
			boolean a=false;
			for(int i=j+1;i<n;i++)
			{
				if(arr[j]<arr[i])
				{
					greater=i;
					a=true;
					break;
				}
			}
			if(a==true)
			{
				int smaller=0;
				boolean b=false;
				for(int i=greater+1;i<n;i++)
				{
					if(arr[greater]>arr[i])
					{
						smaller=arr[i];
						b=true;
						System.out.print(smaller+" ");
						break;
					}
				}
				if(b!=true)
				{
					System.out.print("-1 ");
				}
			}
			else
			{
				System.out.print(-1+" ");
			}
		}
		System.out.print(-1+" ");
	}
}