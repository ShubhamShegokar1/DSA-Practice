package contest7;

import java.util.Scanner;
import java.util.Stack;

public class String_parenthesis
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		Stack <Character>stk= new Stack();
        int i=0; 
        boolean b=false;
		while(i<len)
        {
			b=false;
        	if(str.charAt(i)=='{' || str.charAt(i)=='['  ||str.charAt(i)=='(')
        	{
        		stk.push(str.charAt(i));
        	}
        	if(str.charAt(i)=='}' || str.charAt(i)==')'  ||str.charAt(i)==']')
        	{
        	       if(!stk.isEmpty())
        	       {
        	    	char a=stk.peek();
        	    	if(a=='(' )
        	    	{
        	    		if(str.charAt(i)!=')')		
        	    		break;
        	    	}
        	    	if(a=='{' )
        	    	{
        	    		if(str.charAt(i)!='}')		
        	    		break;
        	    	}
        	    	if(a=='[' )
        	    	{
        	    		if(str.charAt(i)!=']')		
        	    		break;
        	    	}
   
        	    		   stk.pop();
        	    	}
        	       else  
        	       {
        	    	   b=true;
        	    	   System.out.println("unbalanced");
        	    	  break;
        	       }
        	}
        	i++;
        }
	
		if(stk.isEmpty())
		{
			System.out.println("balanced");
		}
		else if(b==false)
		{
			System.out.println("unbalanced");
		}
		
		
	}
}
