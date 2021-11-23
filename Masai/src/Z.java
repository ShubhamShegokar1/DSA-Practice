import java.util.Scanner;

class Z {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int l = 0; l < T; l++) 
		{

			int count = 0;
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < n-1; i++)
			{
				System.out.print(arr[0][i] + " ");

			}
			
			
			
			for (int i = 0; i < n; i++)
			{
				for (int j = n - 1; j >= 0; j--)
				{
					if (count % (n + 1) == 0) 
					{
						System.out.print(arr[i][j] + " ");
					}
					count++;

				}

			}
			
			
			
			for (int i = 1; i < n; i++) 
			{
				System.out.print(arr[n - 1][i] + " ");

			}
			System.out.println();

		}

	}
}
