import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TrackTypingSpeed {
  static int cnt=0;
   static  String str1="";
   static  String str2="";

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	     StringTokenizer st= new StringTokenizer(br.readLine());
	      str1=st.nextToken();
	     StringTokenizer st1= new StringTokenizer(br.readLine());
	      str2=st1.nextToken();
        solve(0,0,str1.length(),str2.length());
        System.out.println(cnt);
	}

	private static void solve( int i, int j,int n1, int n2) {
		if(j==n2) {
			return;
		}
		boolean b=false;
		for(int z=i;z<n1;z++) 
		{
			if(str1.charAt(z)==str2.charAt(j)) 
			{
				cnt+=z-i;
				b=true;
				i=z;
				break;
			}
		}
		if(b==false)
		{
			for(int z=0;z<i;z++) 
			{
				if(str1.charAt(z)==str2.charAt(j)) 
				{
					cnt+=i-z;
					i=z;
				}
			}
		}
		solve( i, j+1, n1 ,n2);
	}

}
