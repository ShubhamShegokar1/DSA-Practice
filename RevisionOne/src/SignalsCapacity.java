import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class SignalsCapacity {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int test = Integer.parseInt(st.nextToken());
		for (int l = 0; l < test; l++) 
		{
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st1.nextToken());
			int arr[] = new int[n];
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) 
			{
				arr[i] = Integer.parseInt(st2.nextToken());
			}
			Stack <Integer> stk = new Stack<>();
			Stack <Integer> index = new Stack<>();
			for (int i = 0; i < n; i++) 
			{
				int cnt=1;
				while(!stk.isEmpty() && stk.peek()<=arr[i]) {
					stk.pop();
					cnt+=index.pop();
				}
				stk.push(arr[i]);
				index.add(cnt);
				System.out.print(cnt+" ");
			}
			System.out.println();
		}

	}
}
