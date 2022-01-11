import java.util.Scanner;

public class MasaiPalindromicSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        int i=0;
        int j=n-1;
        int cnt=0;
        int max=0;
        while(i<n)
        {
        	if(str.charAt(i)==str.charAt(j))
        	{
        		solve(i,j);
        	}
        	else 
        	{
        		cnt=0;
                j--;
        	}
        	if(i>=j)
        	{
        		j=n-1;
        	}
        	if(cnt<max) {
        		max=cnt;
        	}
        }
        
	}

	private static void solve(int i, int j) {
            
		
	}

}
