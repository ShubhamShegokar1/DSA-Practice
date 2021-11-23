package Eval;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Duplicates 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		Stack<Character> stk= new Stack();
		for(int i=0;i<str.length();i++)
		{
			if(stk.isEmpty())
			{
				stk.push(str.charAt(i));
			}
			else
			{
				if(stk.peek()==str.charAt(i))
				{
					stk.push(str.charAt(i));
                    stk.pop();
                    stk.pop();
				}
				else
				{
					stk.push(str.charAt(i));
				}
			}
		}
		if(!stk.isEmpty())
		{
		for(int i=0;i<stk.size();i++)
		{
			System.out.print(stk.get(i));
		}
		}
		else
		{
			System.out.print("Empty String");
		}
		
	}
}
