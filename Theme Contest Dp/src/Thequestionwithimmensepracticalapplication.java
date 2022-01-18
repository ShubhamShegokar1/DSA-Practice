import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Thequestionwithimmensepracticalapplication {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int test = Integer.parseInt(st.nextToken());
		for (int l = 0; l < test; l++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			String str1 = st1.nextToken();
			String str2 = st2.nextToken();
			int textOne = str1.length() ;
			int textTwo = str2.length() ;

			int dp[][] = new int[textOne+1][textTwo+1];
			for (int i = 0; i <= textOne; i++) 
			{
				for (int j = 0; j <= textTwo; j++) 
				{
					if (i == 0 || j == 0)
						continue;
					if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
						dp[i][j] = 1 + dp[i - 1][j - 1];
					}
					else {
						dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
					}

				}
			}
			System.out.println(dp[textOne][textTwo]);

		}
	}

}
