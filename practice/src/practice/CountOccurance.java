package practice;


// Java program to find occurrence of a character in a String

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) 
	{
		System.out.println("Enter String ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count=0;
		System.out.println("Enter char ");
        String ch=sc.nextLine();
        int n=str.length();
        int i=0;		
			for (i = 0; i < n; i++)
			{
				if (ch.charAt(0) == str.charAt(i))
				{
					count = count + 1;
				}

			}
			System.out.println("Count of the number:"+count);			
		}

}