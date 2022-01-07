import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheFamousSum 
{
	public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
     StringTokenizer st= new StringTokenizer(br.readLine());
     String str=st.nextToken();
     int n=Integer.parseInt(st.nextToken());
     StringBuilder sb = new StringBuilder();
         
         long temp=0;
         for(int i=0;i<str.length();i++) {
        	 temp+=Integer.valueOf(str.charAt(i))-48;
         }
         solve(temp*n);
	}

	private static void solve(long num) 
	{
		
		int temp=0;
		while (num > 0) {
		    temp+= num % 10;
		    num = num / 10;
		}
		num=temp;
		if(num<10) {
			System.out.println(num);
			return;
		}
		solve(num);
	}

}
