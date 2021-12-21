import java.util.Arrays;
import java.util.Scanner;
public class AandBonly 
{
    static char arr[]= new char[51];
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	String str=sc.nextLine();
    	int n=str.length();
    	for(int i=0;i<n;i++) 
    	{
    	  if(str.charAt(i)=='a') {
    		  arr[i]='a';
    	  }
    	  else if(str.charAt(i)=='b') {
    		  arr[i]='b';
    	  }
    	  else {
    		  arr[i]='?';
    	  }
    	}
    	for(int i=0;i<n;i++) {
    		if(arr[i]=='?') {
    			solve(i);
    		}
    	}
    }
	private static void solve(int i) {
		arr[i]=0;
		boolean ans=check(i);
		if(ans!=true) {
			arr[i]=1;
		}
	}
	private static boolean check(int i) {
		return false;
	}
}
