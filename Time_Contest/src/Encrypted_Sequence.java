import java.util.*;
import java.util.Scanner;

public class Encrypted_Sequence
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
        
		for (int l = 0; l < t; l++) 
		{
	        Stack<Integer> stack1 = new Stack<Integer>();
	        Stack<Integer> stack2= new Stack<Integer>();

		 int n=sc.nextInt();
		 int  arr[]= new int[n];

		 for(int i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
		 }

		for(int i=0;i<n;i++)
		{
			stack1.push(arr[i]);
			
		}
		for(int i=n-1;i>=0;i--)
		{
			stack2.push(arr[i]);
		}
		//System.out.println(stack1);
		//System.out.println(stack2);
		
		if(n%2!=0)
		{
		for(int i=0;i<n/2+1;i++)
		{
			if(i==n/2)
			{
			System.out.print(stack2.peek()+" ");
			}
			else
			{
				System.out.print(stack2.peek()+" ");
				System.out.print(stack1.peek()+" ");
			}
			
			
			stack1.pop();
			stack2.pop();
		}
		}
		else
		{
			for(int i=0;i<n/2;i++)
			{
				System.out.print(stack2.peek()+" ");
			
				System.out.print(stack1.peek()+" ");
				
				stack1.pop();
				stack2.pop();
			}
		}
		 System.out.println();
		}

	}

}
