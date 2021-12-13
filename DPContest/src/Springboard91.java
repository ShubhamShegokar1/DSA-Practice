import java.util.Arrays;
import java.util.Scanner;

public class Springboard91 {

	static int row;
	static int column;
	static int arr[][]= new int[100][100];
	static int dp[][]= new int[100][100];

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) 
		{
			for(int i=0;i<row;i++) 
			{
				for(int j=0;j<column;j++) 
				{
					arr[i][j]=0;
					dp[i][j]=0;
				}
			}
			 row=sc.nextInt();
			 column=sc.nextInt();
		
			for(int i=0;i<row;i++) 
			{
				for(int j=0;j<column;j++) 
				{
					arr[i][j]=sc.nextInt();
				}
			}
			int max=0;
				for(int j=0;j<column;j++) 
				{
					int temp=solve(0,j);
					if(temp>max) {
						max=temp;
					}
				}
				System.out.println(max);
	
		}
	}
	private static int  solve(int i , int j) 
	{
	   
	   if(i>=row || j>=column || j<0 || i<0) {
			return 0;
		}
	    
	    if(dp[i][j]!=0) {
	    	return dp[i][j];
	    }
	 
		int ans=0;
		int curr=arr[i][j];
		ans=solve(i+1,j);
		ans=max(ans,solve(i+1, j+1));
		ans=max(ans,solve(i+1, j-1));
		dp[i][j]=ans+curr;
		return dp[i][j];
	}
	private static int max(int a, int b) {
		if(a>b) {
			return a;
		}
		return b;
	}
}
