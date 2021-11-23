package contest7;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int l=0;l<t;l++)
		{
			int n=sc.nextInt();
			int ans[]=new int[n];
			int arr[]=new int[n];
			Stack <Integer>stk= new Stack();
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int index_add=n-1;
			for(int i=n-1;i>=0;i--)
			{
				if(i==n-1)
				{
					ans[i]=-1;
					int no=arr[i];
					stk.push(no);
					index_add--;
				}
				else
				{
					int no=arr[i];
					while(!stk.isEmpty() && stk.peek()<=no)
					{
						stk.pop();
					}
					if(stk.isEmpty())
					{
						ans[index_add]=-1;
					}
					else
					{
						ans[index_add]=stk.peek();
					}
					stk.push(no);
					index_add--;
				}
			}

			for(int i=0;i<n;i++)
			{
				System.out.print(ans[i]+" ");
			}
			System.out.println();
		}
	}
}
