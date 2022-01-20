import java.util.Scanner;

public class ImplementStrStr {
	public static void main(String[] args) {
       System.out.println(solve("a","a"));
	}

	private static int solve(String haystack, String needle) {
        if( needle.length()==0) return 0;

		int len =needle.length();
		boolean b=false;
		int i=0;
		for( i=0;i<=haystack.length()-len;i++) 
		{
			if(haystack.charAt(i)==needle.charAt(0)) 
			{
				String temp=haystack.substring(i,i+len);
				if(temp==needle) {
					b=true;
					break;
				}
			}
		}
		
		
        if(b==false) return -1; 
		else return i;
		
	}
}
