package practice3.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Sample6 
{
	static int arr[] = { 1, 2, 4, 5 };
     static String str= Arrays.toString(arr);
	public static void main(String args[]) 
 	{
    Queue<Integer> q = new LinkedList<>();     
    for(int i=0;i<5;i++)
    {
    	q.add(i);
    }
    System.out.println(q);
    q.remove();
    System.out.println(q);
    System.out.println(q.peek());
    
    LinkedList <Integer> list = new LinkedList<>();
    for(int i=0;i<5;i++)
    {
    list.add(i);
    }
     
    Iterator <Integer> itr= list.iterator();
    while(itr.hasNext())
    {
    	System.out.print(itr.next());
    }
 	}
	
}