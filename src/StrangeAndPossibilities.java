import java.util.Scanner;

public class StrangeAndPossibilities 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      for(int i=1;i<=n;i++) {
    	  solve(i,n);
      }
	}

	private static void solve(int i, int n) {
		if(i>n) {
			return;
		}
		System.out.println(i);
		for(int j=i;j<=n;j++) {
			System.out.print(j+" ");
			solve(i+1+j, n);
		}
		System.out.println();
	}
}
