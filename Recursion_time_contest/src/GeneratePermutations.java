import java.util.Scanner;
public class GeneratePermutations 
{
	static int n;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    n=sc.nextInt();
		String str="";
	    for(int i=0;i<n;i++) {
	    	str+=i+1+"";
	    }
	   solve(str,"");
	}
	private static void solve(String stringg, String ans) {
		if(stringg.length()==0) {
			for(int i=0;i<n;i++) {
				System.out.print(ans.charAt(i)+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<stringg.length();i++) {
			char ch=stringg.charAt(i);
			String left=stringg.substring(0,i);
			String right=stringg.substring(i+1);
            String temp=left+right;
            solve(temp, ans+ch);
		}
	}

}