import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	static String str1;
	static boolean ans;
	static String[] arr = new String[1006];
	static int len = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < test; l++) {
			for (int i = 0; i < len; i++) {
				arr[i] = "";
			}
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			len = str2.length();
			int i = str1.length();
			int j = str2.length();
			boolean ans = solve(str1, str2, i, j);
			if (ans)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	private static boolean solve(String str1, String str2, int i, int j) {

		if (i == 0) {
			return true;
		}
		if (j == 0) {
			return false;
		}
		if (str1.charAt(i - 1) == str2.charAt(j - 1)) 
		{
			return solve(str1, str2, i - 1, j - 1);
		}
		return solve(str1, str2, i, j - 1);

	}
}
