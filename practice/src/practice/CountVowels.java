package practice;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) 
	{
		int vCount = 0;
		System.out.println("Enter TSring");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			 if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                vCount++;    
	            }    
		}
		System.out.println(vCount);
	}

}