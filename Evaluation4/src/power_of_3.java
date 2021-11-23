import java.util.Scanner;

public class power_of_3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			double no=sc.nextDouble();
			double count=1;
			boolean b= false;
			while(count<no+1)
			{
				count=count*3;
				if(count==no || no==1)
				{
					b=true;
					System.out.println("YES");
					break;
				}
			}
			if(b==false)
			{
				System.out.println("NO");
			}
		}
	}
}
