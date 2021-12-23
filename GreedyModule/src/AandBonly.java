import java.util.Arrays;
import java.util.Scanner;
public class AandBonly 
{
    static char arr[]= new char[51];
    static int n;
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	String str=sc.nextLine();
    	n=str.length();
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
    	for(int i=0;i<n;i++) {
    		System.out.print(arr[i]);
    	}
    }
	private static void solve(int i) 
	{
		arr[i]='a';
		if(i==0) {
			if(arr[i+1]=='a') {
				arr[i]='b';
			}
		}
		else if(i==n-1) {
			if(arr[i-1]=='a') {
				arr[i]='b';
			}
		}
		else if(i>0 && i<n-1) 
		{
		  	if(arr[i-1]=='a' || arr[i+1]=='a')
		  	{
		  		arr[i]='b';
		  	}
		}
		
	}
}
