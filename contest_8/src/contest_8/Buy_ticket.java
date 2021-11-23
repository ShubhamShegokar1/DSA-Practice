package contest_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Buy_ticket 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		Queue<Integer> q= new LinkedList<>();
		for(int l=0;l<t;l++)
		{
	        char c = sc.next().charAt(0); 
	      //  sc.nextLine();
	        if(c=='E' )
	        {
		        int n=sc.nextInt();	
	        	q.add(n);
	        	System.out.println(q.size()+"");
	        }
	        else
	        {
	            
	        	if(!q.isEmpty())
	        	{	
	        	System.out.print(q.peek()+" "+q.size());
	        	q.remove();
	        	if(q.size()==0)
	        	{
	        		System.out.print(0);
	        	}
	        	System.out.println();
	        	}
	        	else
	        	{
	        		System.out.print(-1+" "+0);
	        	}
	        	
	        
	        	 
	        }
	        
		}
	}
}
