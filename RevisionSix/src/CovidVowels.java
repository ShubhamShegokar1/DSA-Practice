import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CovidVowels {
     static int ans;
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   StringTokenizer st= new StringTokenizer(br.readLine());
		   String str=st.nextToken();
		   solve(str);
		   System.out.println(ans);
	}

	private static void solve(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
			String temp=str.substring(i,j);
		    check(temp);   
			}
		}
	}

	private static void check(String temp) {
	   boolean b[]= new boolean[4];
	   for(int i=0;i<temp.length();i++) 
	   {
		   char ch=temp.charAt(i);

			if (ch == 'a') {
				b[0] = true;
			} else if (ch == 'i') {
				b[1] = true;
			} else if (ch == 'o') {
				b[2] = true;
			} else if (ch == 'u') {
				b[3] = true;
			}
	   }
	   
	   for(int i=0;i<4;i++) {
		   if(b[i]==false) {
			   return;
		   }
	   }
	   ans++;
	}

}
