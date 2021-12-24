import java.util.Scanner;
public class SantoshAndProfit 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 int test = sc.nextInt();
	     for(int i=0;i<test;i++) {
	    	 int n=sc.nextInt();
	    	 System.out.println(solve(n));
	     }
	}
	private static int solve(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		return solve(n-4)+solve(n-8);
	}

}
