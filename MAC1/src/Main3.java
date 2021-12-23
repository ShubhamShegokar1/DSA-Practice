import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for (int l = 0; l < test; l++) 
		{
			 n = sc.nextDouble();
			 if(n<0) {
				 System.out.println(n);
			 }
			 else {
			double ans = n / 2;
			while ((temp - ans) != 0) 
			{
				ans = solve(ans);
			}
			String str=ans+"";
			//System.out.println(str);
			String temp="";
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='.') {
					break;
				}
				temp+=str.charAt(i);
			}
			System.out.println(temp);
		}
		}
	}

	static double temp;
	static double n;

	private static double solve(double ans) {
		temp = ans;
		ans = (temp + (n / temp)) / 2;
		return ans;
	}
}
