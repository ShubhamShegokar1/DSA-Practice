import java.util.Scanner;
public class FibonacciRecursion 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    long ans=solve(n);
	    System.out.println(ans);
	}

	private static long solve(int n) {
		if(n<=1) {
			return n;
		}
		
		return solve(n-1)+solve(n-2);
	}
}
