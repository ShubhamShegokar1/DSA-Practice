package contest_8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class Signal_capacity
{
	public static void main(String[] args)
	{
		
	Scanner sc = new Scanner(System.in);
	int t= sc.nextInt();	
	for(int l=0;l<t;l++)
	{
		Stack <Integer> stk = new Stack();
		Stack<Integer> day=new Stack<Integer>();

		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			int cnt=1;
			while(!stk.isEmpty() && stk.peek()<=arr[i])
			{
				stk.pop();
				cnt+=day.pop();
			}

			day.add(cnt);
			stk.push(arr[i]);
			System.out.print(cnt+" ");
		}
		System.out.println();
	}
}
}
