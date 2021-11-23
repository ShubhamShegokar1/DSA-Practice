import java.util.*;

public class Diamond 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int l = 0; l < T; l++) 
		{
			int n= sc.nextInt();
		
			int arr[][]=new int[n][n];

			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			
			if(n>1)
			{
			int no=n/2;
			//System.out.println(no);
			//for(int i=no;i>-1;i--)
			int i=no;
			for(int j=n-1;j>=no;j--)
			{
				System.out.print(arr[i][j]+" ");
				i--;
			}
			int k=1;
			for(int j=no-1;j>0;j-- ,k++)
			{
				System.out.print(arr[k][j]+" ");
				// System.out.print(k+" "+j);	

			}
			int q=no;
			for(int j=0;j<=no;j++)
			{

				System.out.print(arr[q][j]+" ");
				q++;
			}				
			int p=n-2;
			for(int j=no+1;j<n-1;j++)
			{

				System.out.print(arr[p][j]+" ");
				p--;
			}
			}
			else
			{
				System.out.print(arr[0][0]);
			}
			System.out.println();
		}


	}

}
