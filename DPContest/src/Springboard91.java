import java.util.Scanner;

public class Springboard91 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) 
		{
			int row=sc.nextInt();
			int column=sc.nextInt();
			int arr[][]= new int[row][column];
			for(int i=0;i<row;i++) 
			{
				for(int j=0;j<column;j++) 
				{
					arr[i][j]=sc.nextInt();
				}
			}
			solve(row, column,arr);
		}
	}
	private static int  solve(int row, int column, int[][] arr) 
	{
	   int i=0;
	   int j=0;
	   if(i>=row || j>=column || j<0 || i<0) {
			return 0;
		}
		int ans=0;
		int curr=arr[i][j];
		ans=solve(i+1, j, arr);
		ans=max(ans,solve(i+1, j+1, arr));
		ans=max(ans,solve(i+1, j-1, arr));
		return curr+ans;
	}
	private static int max(int a, int b) {
		if(a>b) {
			return a;
		}
		return b;
	}
}
