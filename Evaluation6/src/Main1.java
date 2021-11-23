import java.util.Scanner;
import java.util.Stack;
public class Main1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack();
		int n =sc.nextInt();	
		int longest=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		  	arr[i]=sc.nextInt();
		}
		int i=0;
		
		while(i<n)
		{  
			int max=0;
			while(i<n && !stk.isEmpty() && stk.peek()==-1*arr[i])
			{
				i++;
				stk.pop();
				max++;
			}
			if(max>longest)
			{
			  longest=max;
			}
					
			if(i<n)
			{
			   stk.push(arr[i]);
			}
			i++;
		}
		System.out.println(longest*2);
	}
}