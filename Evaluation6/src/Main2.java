import java.util.Scanner;
import java.util.Stack;
public class Main2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack();
		int n =sc.nextInt();	
				stk.clear();

		for(int i=0;i<n;i++)
		{
			int add=sc.nextInt();
			if(!stk.isEmpty() && (stk.peek()==-1*add))
			{
				
				stk.pop();
			}
			else
			stk.push(add);
			
		}
		System.out.println(n-stk.size());
	}
}