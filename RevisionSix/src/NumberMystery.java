import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberMystery {
	static long n;
	static long cnt;
	static String temp="";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int test=Integer.parseInt( st.nextToken());
		for(int l=0;l<test;l++)
		{
			n=0;
			cnt=0;
			String temp="";
			StringTokenizer st1= new StringTokenizer(br.readLine());
			n=Integer.parseInt( st1.nextToken());
			solve(n);
		}
	}

	private static void solve(long j) 
	{
       
		boolean b=false;
		while(b==false) 
		{
			    temp=j+"";
				boolean temp1=false;
				for(int i=0;i<temp.length() && temp1==false;i++) 
				{
					if(temp.charAt(i)!='1' && temp.charAt(i)!='0' ) 
					{
						cnt++;
						temp1=true;
					}
				}
				if(temp1==false) {
					System.out.println(temp);
					b=true;
				}
				j+=n;
		}
		
		return ;


	}

}
