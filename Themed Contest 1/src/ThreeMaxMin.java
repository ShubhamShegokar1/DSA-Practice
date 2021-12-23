import java.util.Arrays;
import java.util.Scanner;

public class ThreeMaxMin 
{
	static int n;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 n=Integer.parseInt(sc.nextLine());
		long arr[]= new long[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextLong();
		}
		Arrays.sort(arr);
		solve(arr,n);
		
		
	}

	private static void solve(long[] arr, int n2) 
	{
		if(n<3) {
			System.out.println("Not Possible");
			System.out.println("Not Possible");
			return;
		}
		
		long min1=arr[0];
		long min2=0;
		long min3=0;
		long max1=0;
		long max2=0;
		long max3=arr[n-1];
		for(int i=0;i<n;i++) 
		{
			if(min1<arr[i])
			{
				min2=arr[i];
				break;
			}
		}
		for(int i=0;i<n;i++) 
		{
			if(min2<arr[i])
			{
				min3=arr[i];
				break;
			}
		}
		
		for(int i=n-1;i>-1;i--) 
		{
			if(max3>arr[i])
			{
				max2=arr[i];
				break;
			}
		}
		for(int i=n-1;i>-1;i--) 
		{
			if(max2>arr[i])
			{
				max1=arr[i];
				break;
			}
		}
		if( min1==min2 || min1==min3 || min2 == min3) {
			System.out.println("Not Possible");
		}else {
			System.out.println(min1+" "+min2+" "+min3);
		}
		if( max1==max2 || max1==max3 || max2 == max3) {
			System.out.println("Not Possible");
		}else {
			System.out.println(max1+" "+max2+" "+max3);
		}
		
	}
}
