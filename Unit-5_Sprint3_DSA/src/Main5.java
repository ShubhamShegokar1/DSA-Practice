import java.util.Scanner;

public class Main5 {
    static int n=0;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 int arr[] = new int[n];
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		long ans= solve(0,arr);
		System.out.println(ans);
	}
    static long minAns=0;
    static int j=0;
	private static long solve(int i,int arr[]) {
		if(i>=n-1) 
		{
			long temp= arr[j]-arr[n-1];
			if(temp<0) {
				temp=temp*-1;
			}
			return temp;
		}
		
		long min1=solve(i+1, arr);
		long min2=solve(i+2, arr);
		long minTemp=min(min1,min2);
		minAns+=minTemp;
		return minAns;
	}
	private static long min(long min1, long min2) {
		if(min1>min2) {
			return min2;
		}
		return min1;
	}
}
