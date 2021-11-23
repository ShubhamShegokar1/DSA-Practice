import java.util.Scanner;
import java.util.Stack;
public class stk 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Stack <Integer>stk = new Stack();
		int t=1;
		while(t!=-1)
		{
			 t=sc.nextInt();
			 if(t!=-1)
			 stk.push(t);
		}
		System.out.println(stk);
		sum(stk);
	}

	private static void sum(Stack<Integer> stk) 
	{
		
		if(!stk.isEmpty())
		{
			//System.out.println(stk.peek());
			stk.pop();
			sum(stk);
		}
		
	}

	
}