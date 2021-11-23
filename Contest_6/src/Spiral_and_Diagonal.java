import java.util.Scanner;
class Spiral_and_Diagonal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		int t=sc.nextInt();
		for(int l=0;l<t;l++)
		{
		int n = sc.nextInt();
		int[] array = new int[n*n];

		int[][] arr = new int[n][n];
		for (int i = 0; i < n*n; i++) 
		{
			array[i] = sc.nextInt();

		}
			
			int i=0;
			int top=0;
			int z=0;
			int bottom=n-1;
			int left=0;
			int right=n-1;
			
			while (top <= bottom && left <= right && z < n * n)
			{
				if (i == 0) 
				{
				
					for (int j = left; j <= right; j++)
					{
						arr[top][j] = array[z];
						++z;
					}
					top++;
				}
				else if (i == 1) 
				{
					for (int j = top; j <= bottom; j++) 
					{
						arr[j][right] = array[z];
						++z;
					}
					right--;
				}

				else if (i == 2) 
				{
					for (int j = right; j >= left; j--) 
					{
						arr[bottom][j] = array[z];
						++z;
					}
					bottom--;
				}
				else if (i == 3) 
				{
					for (int j = bottom; j >= top; j--)
					{
						arr[j][left] = array[z];
						++z;
					}
					left++;
				}
				
				i++;
				if (i == n)
				{
					i = 0;
				}
			}
			
		/*
		for(int d=0;d<n;d++)
			{
				for(int j=0;j<n;j++)
				{
						System.out.print(arr[d][j]+" ");

				}
				System.out.println();
			}
			*/
			int dia1=0;
			for(int d=0;d<n;d++)
			{
				for(int j=0;j<n;j++)
				{
					if(d==j)
					{
						dia1=dia1+arr[d][j];
						//System.out.print(arr[d][j]+" ");

					}
				}
			}
			//System.out.println(dia1);

			int dia2=0;
			int cnt=0;
			for(int d=0;d<n;d++)
			{
				for(int j=n-1;j>=0;j--)
				{
					
					if(cnt % (n + 1) == 0)
					{
						dia2=dia2+arr[d][j];
						//System.out.print(arr[d][j]+" ");
					}
					cnt++;
				}
			}
			if(n>1 && n%2!=0)
			{
			System.out.println(dia2+dia1-arr[n/2][n/2]);
			}
			else if(n==1)
			{
				System.out.println(arr[0][0]);
			}
			else 
			{
				System.out.println(dia2+dia1);
			}
		}
	}
}