import java.util.Arrays;
import java.util.Scanner;

public class NumberOfWaysReturnsBack {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      int n= 5;
	      long arr[]= new long[n+1];
	      Arrays.fill(arr, -1);
	      arr[0]=1;
	      System.out.println(findWays(arr,n));
//	      for(int i=0;i<=n;i++) {
//	    	  System.out.print(arr[n-1]+" ");
//	      }
	}
	private static long findWays(long arr[],int n) {
		//System.out.println(n);
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
		System.out.println(n);
		arr[n]= findWays(arr, n-1)+findWays(arr, n-3)+findWays(arr, n-4);
		return arr[n]; 
	}
}
