
import java.util.Scanner;

public class GenerateAllSubsequence {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String str=sc.nextLine();
		solve(str,"",0);			
	}
	private static void solve(String str, String newStr, int i) 
	{
		if(newStr.length()>0) 
		{
			System.out.println(newStr);
		}
		if(i==str.length())
		{
			return;
		}
		for(int z=i;z<str.length();z++) 
		{
			newStr+=str.charAt(z);
			solve(str, newStr, z+1);
			String temp="";
			for(int j=0;j<newStr.length()-1;j++) 
			{
				temp+=newStr.charAt(j);
			}
			newStr=temp;
		}
	}


}
