package practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int n2 = 0,n1 = 1;
       System.out.println("Enter Number");
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println(0);
       for(int i=0;i<n;++i)
       {
            int n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
       }
	}

}       
