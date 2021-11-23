package contest7;

import java.util.Scanner;
import java.util.Stack;

public class Masai_retaurant 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		Stack <Integer>stk= new Stack();
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			if(n==1)
			{
				if(stk.isEmpty())
				{
					System.out.println("No Food");
				}
				else
				{
					System.out.println(stk.peek());
					stk.pop();
				}
			}
			
			if(n==2)
			{
				int add=sc.nextInt();
				stk.add(add);
			}
		}
	}
}
