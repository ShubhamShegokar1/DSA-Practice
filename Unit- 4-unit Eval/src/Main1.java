import java.util.Scanner;

class Main1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for(int l=0;l<test;l++) {
			int n=sc.nextInt();
			int ans=find(n);
			System.out.println(ans);
		}
	}

	private static int find(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		
		return find(n-1)+find(n-2)+find(n-5);
	}

}