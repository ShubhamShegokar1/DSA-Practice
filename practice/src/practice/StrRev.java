package practice;

import java.util.Scanner;
import java.io.*;

public class StrRev {

	public static void main(String[] args)
	{
		System.out.println("Enter TSring");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
try
{
	int start=str.charAt(0);

		int last=str.length()-1;
		
		for(int i=last;i<start;i--)
		{
			System.out.print(str.charAt(i));
		}
}
catch(Exception e)
{
	
}
		System.out.print("\n \n \n");

	}

}
