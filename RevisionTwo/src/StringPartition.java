import java.util.Scanner;

public class StringPartition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int test=Integer.parseInt(sc.nextLine());
	    for(int l=0;l<test;l++) 
	    {
           int n=Integer.parseInt(sc.nextLine());
           String str=sc.nextLine();
           solve(str);
           System.out.println();
	    }
	}

	private static void solve(String str) {
		int n=str.length();
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<=n;j++) 
			{
				String temp=str.substring(i,j);
				boolean ans=check(temp);
				if(ans) 
				{
					System.out.print(temp+" ");
				}
			}
		}
		System.out.print(-1);

	}

	private static boolean check(String temp) {
		int i=0;
		int j=temp.length()-1;
		while(i<=j) {
		 if(temp.charAt(i)!=temp.charAt(j)) {
			 return false;
		 }
		 i++;
		 j--;
		}
		return true;
	}

}
