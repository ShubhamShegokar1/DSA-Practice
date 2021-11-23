package practice;

import java.util.Scanner;

public class s {
	public static void main(String args[]) 
	{
		System.out.println("Enter ");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		System.out.println(isPalindromString(n));
	}

	
	public static boolean isPalindromString(String text) {
		String reverse = reverse(text);
		if (text.equals(reverse)) {
			return true;
		}
		return false;
	}

	public static String reverse(String input)
	{
		if(input == null || input.isEmpty())
		{ 
			return input;
		} return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1)); 
	}
}


