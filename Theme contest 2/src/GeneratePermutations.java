import java.util.Scanner;

public class GeneratePermutations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        String str="";
        for(int i=0;i<n;i++) {
        	str+=i+1+"";
        }
        solve(str,"");
	}

	private static void solve(String str, String ans) {
		if(str.length()==0) {
			for(int i=0;i<ans.length();i++) {
				System.out.print(ans.charAt(i)+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			String left=str.substring(0,i);
			String right=str.substring(i+1);
            String temp=left+right;
            solve(temp, ans+ch);
		}
	}

}
