import java.util.Arrays;
import java.util.Scanner;

class Spirally_traversing {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
	    int n = sc.nextInt();
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					arr[i][j] = sc.nextInt();
				}
			}
			
			int i=0;
			int top=0;
			int bottom=n-1;
			int left=0;
			int right=n-1;
			while(top<=bottom && left<=right)
			{
				if(i==0)
				{
					for(int j=left;j<=right;j++)
					{
						System.out.print(arr[top][j]+" ");
				        
					}
					top++;
				}
				
				else if(i==1)
				{
					for(int j=top;j<=bottom;j++)
					{
						System.out.print(arr[j][right]+" ");
				        
					}
					right--;
				}
				else if(i==2)
				{
					for(int j=right;j>=left;j--)
					{
						System.out.print(arr[bottom][j]+" ");
				        
					}
					bottom--;
				}
				else if(i==3)
				{
					for(int j=bottom;j>=top;j--)
					{
						System.out.print(arr[j][left]+" ");
				        
					}
					left++;
				}
				
				i++;
				if(i==n)
				{
					i=0;
				}
				
			}
	}
}