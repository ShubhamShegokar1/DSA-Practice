import java.util.Scanner;
class Hacks3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int l = 0; l < T; l++)
		{
			double n=sc.nextDouble();
			while(n%20==0)
			{
				n=n/20;
			}
			while(n%10==0)
			{
				n=n/10;
			}
			if(n==1)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}

}
