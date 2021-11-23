package contest7;

import java.util.Scanner;
import java.util.Stack;

public class Binary_String
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int coin1=sc.nextInt();
		int coin2=sc.nextInt();
		int max=0;
		if(coin1>=coin2)
		{
			max=coin1;
		}
		else
		{
			max=coin2;
		}
	
	    sc.nextLine();
		String str=sc.nextLine();
		int len=str.length();
		Stack <Character>stk = new Stack();
		int i=0;
		int one=0;
		int zero=0;
		
		while(i<n)
		{
			stk.push(str.charAt(i));
			if(str.charAt(i)=='0')
			{
				zero++;
			}
			else
			{
				one++;
			}
			i++;
		}
		//System.out.println(stk);
		int cnt=0;
		while(!stk.empty())
		{
			if(stk.peek()=='0')
			stk.pop();
			if(stk.peek()=='1')
			stk.pop();
			{
			 cnt=cnt+coin1;
			}
		}
      System.out.println(cnt);			
		
	}
}
