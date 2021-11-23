import java.util.Scanner;

class Ones_Zeros_easy {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for (int l = 0; l < T; l++)
		{
			int zero=sc.nextInt();
			int one=sc.nextInt();
			int max=0;
			int min=0;
			if(one>zero)
			{
				max=one;
				min=zero;
			}
			else
			{
				max=zero;
				min=one;
			}
			//-----------------------------------------------------------------------------
			if(max-min>1)
			{
				System.out.println(-1);

			}
			//------------------------------------------------------------------------------
			else if(zero==one)
			{
				int cnt=0;
				while(cnt<max)
				{
					System.out.print("01");
					cnt++;
				}
				System.out.println();

			}
			else if(max==one)
			{
				int cnt=0;
				System.out.print("1");
				while(cnt<max-1)
				{
					System.out.print("01");
					cnt++;
				}
				System.out.println();

			}
			else if(max==zero)
			{
				int cnt=0;
				System.out.print("0");
				while(cnt<max-1)
				{
					System.out.print("10");
					cnt++;
				}
				System.out.println();
			}
				
		}
	}
}