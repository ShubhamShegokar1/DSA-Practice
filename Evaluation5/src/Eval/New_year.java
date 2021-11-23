package Eval;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class New_year 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int add=0;
		Stack<Integer> stk= new Stack();
		Queue<Integer> q= new LinkedList();
		for(int i=0;i<n;i++)
		{
			int j=sc.nextInt();
			
			
			if(j==1)
			{
				int element=sc.nextInt();
				q.add(element);
				

			}
			else if(j==2)
			{
				int element=sc.nextInt();
				stk.push(element);
				//System.out.println(stk);
			}
			else if(j==3)
			{
				if(!q.isEmpty())
				{
					System.out.println(q.peek());
					add=q.remove();
					
				}
				else
				{
					System.out.println(-1);
				}

			}
			else if(j==4)
			{
				//System.out.println(stk);
				if(!stk.isEmpty())
				{
					System.out.println(stk.peek());
					
				}
				else
				{
					System.out.println(-1);
				}
			}
			else if(j==5)
			{
				stk.push(add);
			}



		}
	}
}
