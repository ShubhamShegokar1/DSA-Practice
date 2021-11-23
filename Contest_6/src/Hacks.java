import java.util.Scanner;
class Hacks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for (int l = 0; l < T; l++)
		{

			double n=sc.nextDouble();
			if(n<=400000)
			{
				double ans=1;
				if(ans==n)
				{
					System.out.println("Yes");
				}
				else if(ans*10==n)
				{
					System.out.println("Yes");
				}
				else if(ans*20==n)
				{
					System.out.println("Yes");
				}
				else if(ans<n && ans*10>n)
				{
					System.out.println("No");
				}
				else
				{
					boolean b=false;
					while(ans<n+1)
					{
						ans=ans*10;
						if(ans==n)
						{
							System.out.println("Yes");
							b=true;
							break;
						}
						if(ans<n)
						{
							ans=ans*20;
						}
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
			//-----------------------------------------------------------------------------------
			else if(n>400000 && n<Integer.MAX_VALUE)
			{
				boolean b=false;
				double ans=400000;
				if(ans==n)
				{
					System.out.println("Yes");
				}
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
			
			//---------------------------------------------------------------------
			else
			{
				double ans=1600000000;
				boolean b=false;
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