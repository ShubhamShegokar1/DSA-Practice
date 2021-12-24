import java.util.Scanner;
public class FactorialRecursion 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
	    long ans=solve(n);
	    System.out.println(ans);
	}
	static int n;
   static long arr[]= new long[n+1];
	private static long solve(int n) {
		if(n<=0) {
			return 1;
		}
	   	
	   arr[n]= n*solve(n-1);
	   return arr[n];
	}
}
