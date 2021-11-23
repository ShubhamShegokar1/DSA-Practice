import java.util.Arrays;
import java.util.Scanner;
class Good_Pairs
{	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	 
		for (int l = 0; l < T; l++) 
		{
			int n=sc.nextInt();
			int[]arr = new int[n];

			for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();	
			}
			Arrays.sort(arr);
			/*for (int i = 0; i < n; i++)
			{
				System.out.print(arr[i]+" ");
			}*/
			int cnt=0;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if(arr[j]==2*arr[i] && i!=j)
					{
						cnt++;
					}
				}
			}
			System.out.print(cnt);
			System.out.println();
		}
	}
}