import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Tallest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for(int l=0;l<test;l++ )
		{
			int n=sc.nextInt();
			int interval=sc.nextInt();
			int arr[]= new int[n];
			Deque<Integer> dq = new LinkedList<Integer>();

			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
		
			for(int i=0;i<n;i++)
			{
				dq.add(arr[i]);
				int max=0;
				if(i>=interval-1)
				{
					for (Integer number : dq) 
					{
					  if(max<number)
					  {
						  max=number;
					  }
				    }
					System.out.print(max+" ");
					dq.removeFirst();
				}
			}
			System.out.println();
		}
	}
}