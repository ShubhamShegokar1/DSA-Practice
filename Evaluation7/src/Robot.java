
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Robot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int digits=sc.nextInt();
	    ArrayList<Integer>list= new ArrayList<>();
	    Queue q = new LinkedList();
        Stack stk= new Stack();
		int i=0;
		while(i<digits)
		{
			list.add(sc.nextInt());
			i++;
		}
	    sc.nextLine();
		String str=sc.nextLine();
		for(int j=0;j<digits;j++)
		{
			if(str.charAt(j)=='0')
			{
				while(!stk.isEmpty())
				{
					
				}
			}
			else
			{
				
			}
		}
		
		
	}
}
