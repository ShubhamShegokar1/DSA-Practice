
import java.util.Scanner;
public class fac 
{
	static int fac(int n)
	{
		if(n==0)
		return 1;
		else
		return (n*fac(n-1));
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int ans=fac(n);
		System.out.print(ans);
		
	}
}