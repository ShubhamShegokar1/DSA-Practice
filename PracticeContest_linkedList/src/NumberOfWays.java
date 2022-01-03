import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberOfWays {
    static int n;
	public static void main(String[] args) 
	{ 
	      Scanner sc = new Scanner(System.in);
	       n=sc.nextInt();
	      System.out.println(solve(n));
	}
	private static int solve(int n) {
	  if(n==0) {
		  return 1;
	  }
	  if(n<0) {
		  return 0; 
	  }
	  return solve(n-1)+solve(n-2)+solve(n-3);	
	}
}
