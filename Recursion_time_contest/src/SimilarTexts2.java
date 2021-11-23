import java.util.Scanner;
import java.text.DecimalFormat;
public class SimilarTexts2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println( find(s1,s2,0,0));
	}

	static int cnt=0;
	static int cnt2=0;
	private static int find(String s1, String s2,int p1 ,int p2) 
	{
		if(p1==s1.length() || p2==s2.length()) {
			return 0;
		}
       //System.out.println(s1.charAt(p1)+" "+s2.charAt(p2));
		if(s1.charAt(p1)==s2.charAt(p2)) {
			return 1+find(s1, s2,p1+1,p2+1);
		}
		else
		{		
			 return max( find(s1, s2,p1+1,p2),find(s1, s2,p1, p2+1));
			 
		}
		
	}
	private static int max(int a, int b) {
		if(a>b)
		return a;
		else
			return b;
	}

}