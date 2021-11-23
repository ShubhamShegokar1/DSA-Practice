package contest7;

import java.util.Scanner;
import java.util.Stack;

public class Smaller_Neighbour_Element
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		Stack <Integer>stk= new Stack();
			int n=sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			{
			   arr[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++)
			{
				while (!stk.empty() && stk.peek() >= arr[i]) 
				{
					stk.pop();
				}

				if (stk.empty())
				{
					System.out.print("-1 ");
				} 
				else 
				{
					System.out.print(stk.peek() + " ");
				}

				stk.push(arr[i]);
			}

			
	}
}
