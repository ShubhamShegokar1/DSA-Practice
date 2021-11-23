import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class birthday 
{
	static int i=1;
	public static void fun(int n, int pairs)
	{
		if(i<=pairs)
		{
		 System.out.print(i+" ");
		 i++;
		 fun(n,pairs--);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int pairs=sc.nextInt();		
		fun(n,pairs);
	} 
}
