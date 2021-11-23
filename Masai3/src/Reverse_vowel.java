import java.util.*;
public class Reverse_vowel 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 int n = Integer.parseInt(sc.nextLine()); 
	        Stack<Character> stack = new Stack<Character>();

	     for(int i=0;i<n;i++)
	     {	 
	    	 
	       stack.clear();
		   String str=sc.nextLine();
		   int len=str.length();
		   for (int g = 0; g < len; g++)
			{
				if (str.charAt(g) == 'a' || str.charAt(g) == 'e' || str.charAt(g) == 'i'
						|| str.charAt(g) == 'o' || str.charAt(g) == 'u')
				{
					char ch=str.charAt(g);
					stack.push(ch);
				}
			}
		   
		   for(int j=0;j<len;j++)
		   {
			   
			   if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i'
						|| str.charAt(j) == 'o' || str.charAt(j) == 'u')
				{
				   System.out.print(stack.peek());
				   stack.pop();
				}
			   else
			   {
				System.out.print(str.charAt(j));
			   }
		   }
		   
		   System.out.println();
	     }	 
	}
}
