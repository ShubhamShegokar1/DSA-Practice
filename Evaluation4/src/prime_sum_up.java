import java.util.Scanner;

public class prime_sum_up
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int ans=0;
        for(int i=1;i<=n;i++)
        {
        	int count=0;
        	for(int j=2;j<=i/2;j++)
        	{
        		if(i%j==0)
        		{
        			count++;
        		}
        	}
        	if(count==0 && i!=1)
        	{
        		ans=ans+i;
        	}
        }
        System.out.println(ans);
		
	}
}
