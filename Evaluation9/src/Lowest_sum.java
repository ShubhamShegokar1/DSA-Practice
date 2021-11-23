import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Lowest_sum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for(int l=0;l<test;l++)
		{
		  int n=sc.nextInt();
		  int target=sc.nextInt();
		  int arr[]= new int[n];
		   Stack <Integer> stk = new Stack();
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int x=0;
			int y=0;
			Arrays.sort(arr);
			
			boolean flag=true;
			while(y<n && flag==true)
			{
				int r=arr[x]+arr[y];
				if(r>target)
				{
				
					 if(stk.isEmpty())
					{
						  stk.push(r);
						  flag=false;
					}
					
				}
				//System.out.println(y);
				y++;
				if(y==n)
				{
					
					x++;
					y=x;
				}
			}
			System.out.println(stk.peek());
		}
	

	}
}
