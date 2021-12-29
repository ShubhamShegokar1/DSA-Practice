import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GeneratePermutations {
    static int n;
	public static void main(String[] args) 
	{ 
	      Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      String  str="";
    	  for(int i=1;i<=n;i++) {
    		 int temp=sc.nextInt();
    		  str+=temp+"";
    	  }
    	solve(str,"");
	}
	private static void solve(String str, String string) {
		if(str.length()==0) {
			for(int i=0;i<string.length();i++) {
				System.out.print(string.charAt(i)+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String leftPart=str.substring(0,i);
			String righPart=str.substring(i+1);
			String temp=leftPart+righPart+"";
			solve(temp, string+ch);
		}
	}
}
