import java.util.Scanner;
import java.util.Stack;

public class Stack_sum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Stack<Integer>  stk = new Stack();
		int s=0;
		for(int i=0;i<n;i++)
		{
			int casee=sc.nextInt();
		  	if(casee==1)
		  	{
		  		int no=sc.nextInt();
		  		stk.push(no);
		  	}
		  	else
		  	{
		  		if(stk.isEmpty())
		  		{
		  		  s=s-1;	
		  		}
		  		else
		  		{
		  			s=s+stk.peek();
		  			stk.pop();
		  			
		  		}
		  	}
		}
		System.out.println(s);
	}
}
