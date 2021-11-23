package practice2;

import java.util.*;

class TestClass 
{
	public static void main(String args[])
	{
		int T = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter T");
		if (T <= 1000) 
		{
			if (1 <= T) 
			{
				T = sc.nextInt();
				System.out.println("Done");
			}
		} else 
		{
			System.out.println("YOu entered wrong");
		}
		String name = sc.nextLine();
		System.out.println("Hi, " + name + ".");

	}
}
