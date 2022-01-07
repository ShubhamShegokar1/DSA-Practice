import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FaultyDirection {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		int test = Integer.parseInt(st.nextToken());
		for (int l = 0; l < test; l++) 
		{
			StringTokenizer st1 = new StringTokenizer(br.readLine());		
			int n = Integer.parseInt(st1.nextToken()); 
			StringTokenizer st2 = new StringTokenizer(br.readLine());		
            String str=st2.nextToken();
            int xDirection=0;
            int yDirection=0;
            for(int i=0;i<n;i++) 
            {
            	if(str.charAt(i)=='R') {
            		xDirection++;
            	}
            	else if(str.charAt(i)=='L') {
            		xDirection--;
            	}
            	else if(str.charAt(i)=='U') {
            		yDirection++;
            	}
            	else {
            		yDirection--;
            	}
            }
            if(xDirection==0 && yDirection==0) {
            	System.out.println("Yes");
            }else {
            	System.out.println("No");
            }
		}
	}
}
