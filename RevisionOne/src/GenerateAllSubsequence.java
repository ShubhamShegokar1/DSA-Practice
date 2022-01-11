import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GenerateAllSubsequence {
      static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		 n=Integer.parseInt(st.nextToken());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		String str=st1.nextToken();		
		solve(str,"",0);
	}

	private static void solve(String str, String newString, int curr) {
		if(newString.length()>0) System.out.println(newString);
		
		if(curr==n) {
			return;
		}
		
		for(int i=curr;i<str.length();i++) {
			newString+=str.charAt(i);
			solve(str, newString, i+1);
			int len=newString.length()-1;
			String temp=newString.substring(0, len);
			newString=temp;
		}
		
	}
}
