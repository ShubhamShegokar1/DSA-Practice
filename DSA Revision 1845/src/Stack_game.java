import java.util.Scanner;
import java.util.Stack;

public class Stack_game 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for(int l=0;l<test;l++)
		{
		  Stack<Character>  stk = new Stack();
		  int left =sc.nextInt();
		  int right=sc.nextInt();
		  sc.nextLine();
		  String str=sc.nextLine();
		  //System.out.println(str);
		  int len =str.length();
		  int i=0;
		  boolean flag=false;
		  while(i<len)
		  {
			   
			  if( str.charAt(i)=='(')
			  {
				  stk.push(str.charAt(i));
			  }
			  else
			  {
				  if(stk.isEmpty())
				  {
					  flag=true;
					  System.out.println(-1);
					  break;
				  }
				  else
				  {
					  stk.pop();
				  }
			  }
			  i++;
		  }
		  if(flag==false)
		  {
			 System.out.println(stk.size());  
		  }
		}
	}
}
