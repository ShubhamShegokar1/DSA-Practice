import java.util.Scanner;

public class GeneratePermutations {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		String str="";
		for(int i=0;i<n;i++) {
			str+=sc.nextInt();
		}	
		solve(str,"");
	}

	private static void solve(String str, String newString) {
	   if(str.length()==0) {
		   for(int i=0;i<newString.length();i++) {
			   System.out.print(newString.charAt(i)+" ");
		   }
		   System.out.println();
	   }
	   
		for(int i=0;i<str.length();i++) {
			char temp=str.charAt(i);
			String left=str.substring(0,i);
			String right=str.substring(i+1);
            String curr=left+right;
            solve(curr, newString+temp);
		}
	}

	

}
