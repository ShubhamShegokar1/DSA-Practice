package Eval;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Side_lane 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int test=1;
		int cnt=0;
		while(test!=0)
		{
			int n  = sc.nextInt();
			Stack<Integer> stk= new Stack();
			Stack<Integer> stk1= new Stack();
            stk.clear();
            stk1.clear();
			int arr[] =new int[n];
			int arr1[] =new int[n];

			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}

			

               int i=0;
			while(i<n-1)
			{

				if( arr[i]<arr[i+1]  )
				{
					if(!stk.isEmpty() && stk.peek()>arr[i])
					{
						break;
					}
					stk.push(arr[i]);
				}
				else
				{
					stk1.push(arr[i]);
				}
                 
				
				while(!stk.isEmpty() && !stk1.isEmpty() && (stk.peek()<stk1.peek() && stk1.peek()<arr[i+1]) )
				{
					int add=stk1.peek();
					stk1.pop();
					stk.push(add);
				}
				if(i==n-2)
				{
					if(!stk1.isEmpty() && arr[n-1]<stk1.peek() && arr[n-1]>stk.peek() || (stk1.isEmpty() && arr[n-1]>stk.peek() ))
					{
						stk.push(arr[n-1]);
					}
					else
					{
						stk1.push(arr[n-1]);
					}
					while(!stk1.isEmpty() && !stk.isEmpty() && stk.peek()<stk1.peek() )
					{
					
						int add=stk1.peek();
						stk1.pop();
						stk.push(add);
					}
				}
				i++;

			}
			
			if(stk1.isEmpty())
			{
				System.out.println("yes"+" "+cnt);
			}
			else
			{
				System.out.println("no");
			}
			 test=sc.nextInt();
		 cnt++;
			
		}

	}
}