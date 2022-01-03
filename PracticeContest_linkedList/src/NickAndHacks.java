import java.util.Scanner;

public class NickAndHacks {
   
	static boolean b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int test=sc.nextInt();
	        for(int l=0;l<test;l++)
	        {
	        	b=false;
	        	long n=sc.nextLong();
	        	solve(1, n);
	        	if(b) {
	        		System.out.println("Yes");
	        	}
	        	else {
	        		System.out.println("No");
	        	}
	        }
	}

	private static void solve(long i,long n) {
		if(i==n) {
		   b=true;
		   return;
		}
		if(i>n) {
			return ;
		}
		
		solve(i*10,n);
		solve(i*20,n);
	}

}
