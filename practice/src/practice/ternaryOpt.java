package practice;

import java.util.Scanner;

public class ternaryOpt 
{
	public static void main(String[] args) 
	{

		 int a=4;
		 int b=3;
		 int c=29;	

		 int z= a>b ? a>c?a:c :(b>c?b:c);
		 System.out.println(z);
	}

}
