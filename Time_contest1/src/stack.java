
import java.util.Scanner;
import java.util.Stack;

class stack 
{
	public static void main(String[] args) 
	{
		Stack <Integer>stk = new Stack();
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int j=sc.nextInt();
			if(j==1)
			{
				int no=sc.nextInt();
				stk.push(no);
			}

			if(j==2)
			{
				
				if(!stk.isEmpty())
				{
					stk.pop();
				}
			}
			if(j==3)
			{
				if(stk.isEmpty())
				{
					System.out.println("Empty!");
				}
				else
				{
					System.out.println(stk.peek());
				}
			}
		}
	}
}