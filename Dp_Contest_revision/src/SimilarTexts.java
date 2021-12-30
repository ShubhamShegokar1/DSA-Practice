import java.util.Scanner;

public class SimilarTexts {
	  static String str1="";
	  static String str2="";
	  static int len1;
	  static int len2;
	public static void main(String[] args) 
	{
      Scanner sc= new Scanner(System.in);       
       str1=sc.nextLine();
       str2=sc.nextLine();
       len1=str1.length();
       len2=str2.length();
       System.out.println(solve(0,0));
	}
	
	private static int solve(int i, int j) {
		if(i==len1 || j==len2) {
			return 0;
		}
		if(str1.charAt(i)==str2.charAt(j)) {
			System.out.println(str1.charAt(i)+" "+str2.charAt(j));
			return 1+solve(i+1, j+1);
		}
		else {
			System.out.println(str1.charAt(i)+" "+str2.charAt(j));
			return max(solve(i+1, j),solve(i, j+1));
		}
	}

	private static int max(int solve1, int solve2) {
		if(solve1<solve2) {
			return solve2;
		}
		return solve1;
	}
	

}
