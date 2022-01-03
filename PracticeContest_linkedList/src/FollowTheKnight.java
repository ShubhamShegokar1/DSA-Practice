import java.util.Scanner;

public class FollowTheKnight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int n=sc.nextInt();
		 solve(i,j,n);
		 int cnt=0;
			for(int a=0;a<=10;a++)
			{
				for(int b=0;b<=10;b++)
				{
					if(arr[a][b]==1)
						cnt++;
				}
			}
			System.out.println(cnt);
	}
   static int arr[][]= new int[11][11];
	private static void solve(int i, int j, int n) {
		if(n==0) {
			arr[i][j]=1;
			return; 
		}
		if(i-1>=1 && j-2>=1)
		{
			solve( i-1, j-2,n-1); //2 1
		}
		if(i-2>=1 && j-1>=1)
		{
			solve( i-2, j-1, n-1);
		}
		if(i-2>=1 && j+1<=10)
		{
			solve( i-2, j+1, n-1);
		}
		if(i-1>=1 && j+2<=10)
		{
			solve( i-1, j+2, n-1);
		}
		if(i+2<=10 && j+1<=10)
		{
			solve( i+2, j+1, n-1);
		}
		if(i+1<=10 && j+2<=10)
		{
			solve( i+1, j+2, n-1);
		}
		
		if(i+1<=10 && j-2>=1)
		{
			solve( i+1, j-2, n-1);
		}
		if(i+2<=10 && j-1>=1)
		{
			solve( i+2, j-1, n-1);
		}
	}

}
