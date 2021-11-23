
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Equalization 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int digits=Integer.parseInt(sc.nextLine());
       String str=sc.nextLine();
       ArrayList<Integer>list= new ArrayList<>();
      
       for(int i=0;i<digits;i++)
       {
    	   char c=str.charAt(i);
    	   if('0'<=c && c<='9')
    	   {
    		   int add=Character.getNumericValue(c);
    		   list.add(add);
    	   }
       }
       
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
        	sum=sum+list.get(i);
        }
	    if(sum<=17)
	    {
	    	System.out.println("NO");
	    }
	    else
	    {
	    	System.out.println("Yes");
	    }
	    
        
	}
}
