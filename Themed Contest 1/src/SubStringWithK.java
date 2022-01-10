import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SubStringWithK {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		String str=st1.nextToken();
		int ans=0;		
       
		for(int i=0;i<=n-k;i++) 
		{
			char arr[]= new char[27];
			boolean b=false;
			for(int j=i;j<i+k;j++)
			{
				if(arr[str.charAt(j)-'a']==1) {
					b=true;
					break;
				}
				arr[str.charAt(j)-'a']++;
			}
			if(b==false) {
				ans++;
			}
			
		}
		System.out.println(ans);
	}

}
