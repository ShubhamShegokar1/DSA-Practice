import java.util.Arrays;
import java.util.Scanner;

public class NumberOfWaysReturns {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      int n =sc.nextInt();
	      long arr[]= new long[n+1];
	      Arrays.fill(arr, -1);
	      arr[0]=1;
	      System.out.println(findWays(arr,n));
	}
	private static long findWays(long arr[],int n) {
		if( n>=0)
		{
			if(arr[n]!=-1) {
			return arr[n];
			}
		}
		if(n==0){
			return 1;
		}
		if(n<0) {
			return 0;
		}	
		arr[n]= findWays(arr, n-1)+findWays(arr, n-2)+findWays(arr, n-3);
		return arr[n]; 
	}
}
