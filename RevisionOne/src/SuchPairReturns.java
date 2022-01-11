import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SuchPairReturns 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int test=Integer.parseInt(st.nextToken());
		for(int l=0;l<test;l++) 
		{
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st1.nextToken());
			int k=Integer.parseInt(st1.nextToken());
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int arr[]=new int[n];
			for(int i=0;i<n;i++) 
			{
				arr[i]=Integer.parseInt(st2.nextToken());
			}
			boolean b=false;
			HashMap<Integer, Integer> map= new HashMap<>();
			for(int i=0;i<n;i++) {
				int temp=k-arr[i];
				if(map.containsKey(temp)) 
				{
					b=true;
					System.out.println(1);
					break;
				}
				else {
					map.put(arr[i], i);
				}		
			}
			if(b==false) {
				System.out.println(-1);
			}
		}
	}
}
