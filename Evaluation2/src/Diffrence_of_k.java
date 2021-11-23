import java.util.*;

public class Diffrence_of_k 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int l = 0; l < T; l++) 
		{
			int n= sc.nextInt();
			int k=sc.nextInt();
			int arr[]=new int[n];

			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int p1=0;
			int p2=n-1;
			boolean b=false;
			while(p1<p2)
			{
				if(arr[p2]-arr[p1]==k )
				{
					System.out.print("Yes");
					b=true;
					break;
				}
				else
				{

					p1++;
				}
				if(arr[p2]-arr[p1]>k)
				{
					p2--;
					p1=0;
				}
			}
			if(b==false)
			{
				System.out.print("No");
			}
			System.out.println();
		}
	}
}
