import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class peakpoint 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int l=0;l<test;l++)
		{
			int n=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			for(int i=1;i<n;i++)
			{
				if(arr[i]<arr[i-1])
				{
					System.out.println(i-1);
					break;
				}
			}
		}
	} 
}
