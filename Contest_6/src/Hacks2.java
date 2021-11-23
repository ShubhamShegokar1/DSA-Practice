import java.util.Scanner;
class Hacks2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int l = 0; l < T; l++)
		{
			int n=sc.nextInt();
			int ans=1;
			boolean b=false;
			if(ans==n)
			{
				System.out.println("Yes");

			}
           else
			{
				while(ans<n+1)
				{
					ans=ans*10;
					if(ans==n)
					{
						System.out.println("Yes");
						b=true;
						break;
					}
					ans=ans*20;
					if(ans==n)
					{
						System.out.println("Yes");
						b=true;
						break;
					}
				}
				if(b==false)
				{
					System.out.println("No");
				}
			}
		}
	}

}
