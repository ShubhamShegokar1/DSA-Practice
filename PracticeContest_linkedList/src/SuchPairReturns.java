import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SuchPairReturns {

	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < test; l++) 
		{
			long n=sc.nextLong();
			int arr[]=new int[(int) n];
			long k=sc.nextLong();
			
			for(int i=0;i<n;i++) 
			{
			 arr[i]= sc.nextInt();
			}
			boolean b=true;
			for(int i=0;i<n && b==true;i++) 
			{
				for(int j=i+1 ;j<n;j++) 
				{
					if(arr[i]+arr[j]==k) 
					{
						b=false;
						System.out.println(1);
						break;
					}
				}
			}
			if(b)
			System.out.println(-1);
		}
	}

}
