import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class can_they_equal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for(int l=0;l<test;l++)
		{
		  int n = Integer.parseInt(sc.nextLine());
		  String a=sc.nextLine();
		  String b=sc.nextLine();
		  ArrayList<Character> list = new ArrayList<>();
		  for(int i=0;i<n;i++)
		  {
			 list.add(b.charAt(i));
		  }	  
		 // System.out.println(list);
		   boolean bool=false;
		   for(int i=0;i<n;i++)
		   {
			   int j=0;
			   bool=false;
			  while(j<list.size())
			  {
				   if(a.charAt(i)==list.get(j))
				   {
					 list.remove(j) ; 
					 bool=true ; 
					 break;
				   }
				   j++;
			   }
			  if(bool==false)
			  {
				  System.out.println("No");
				  break;
			  }
		   }
		   if(bool==true)
		   {
			   System.out.println("Yes");
		   }
		  
          
		}
	} 
}
