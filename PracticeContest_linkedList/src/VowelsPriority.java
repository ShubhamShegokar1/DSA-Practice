import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class VowelsPriority {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(	new InputStreamReader(System.in));
		StringTokenizer st	= new StringTokenizer(br.readLine());
		int test = Integer.parseInt(st.nextToken());
		for (int l = 0; l < test; l++) 
		{
			StringTokenizer st1	= new StringTokenizer(br.readLine());
             String str=st1.nextToken();
             StringBuilder v = new StringBuilder();
             StringBuilder c = new StringBuilder();
			for (int i = 0; i < str.length(); i++) 
			{
				char temp = str.charAt(i);
				if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
					v.append(temp);
				}
				else {
					c.append(temp);
				}
			}
			

			System.out.println(v.append(c));
		}

	}

}
