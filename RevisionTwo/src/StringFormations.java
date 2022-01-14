import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringFormations {
	static int operation;
	static String str1;
	static String str2;
	static int len;

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int test = Integer.parseInt(st1.nextToken());
		for (int l = 0; l < test; l++) 
		{
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			StringTokenizer st4 = new StringTokenizer(br.readLine());
			str1 = st2.nextToken();
			str2 = st3.nextToken();
			if(str1.length()<str2.length()) {
				len=str1.length();
			}else len= str2.length();
			operation = Integer.parseInt(st4.nextToken());
			boolean ans=solve();
			if(ans) System.out.println("Yes");
			else System.out.println("No");
		}
	}

	private static boolean solve() 
	{		
		for (int i = 0; i < len; i++) 
		{
			if (str1.charAt(i) != str2.charAt(i) || i==str1.length()-1) 
			{
              operation-=str1.length()-i;     
              while(i<str2.length()) 
              {
            	  if(operation<=0) 
            	  {
            		  return false;
            	  }
            	  i++;
            	  --operation;
              }     

			}
			
		}
		return true;

	}

}
