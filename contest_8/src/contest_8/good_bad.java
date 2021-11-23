package contest_8;

import java.util.Scanner;
import java.util.Stack;

public class good_bad 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		for(int l=0;l<t;l++)
		{
			String str=sc.nextLine();
		    int len=str.length();
			Stack <Character>stk= new Stack();
		    int i=1;
    		stk.push(str.charAt(0));
    		System.out.print(stk.peek());
		    while(i<len)
		    {
		    	if(stk.peek()!=str.charAt(i))
		    	{
		    		stk.pop();
		    		stk.push(str.charAt(i));
		    		if(!stk.isEmpty())
		    		{
		    		System.out.print(stk.peek());
		    		}
		    		
		    	}
		    	i++;
		    }
		    
		  
		}
	}
}
