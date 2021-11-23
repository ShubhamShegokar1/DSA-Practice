package practice;

import java.util.Scanner;

public class InvertPyramid {

	public static void main(String[] args)
	{
		System.out.println("Enter no");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

	for(int i=0;i<n;i++)
	{ 		
		for(int j=(i+1);j<n;j++)
		{					
			System.out.print("*");
		}

		System.out.println();
	}
	

    }
}
