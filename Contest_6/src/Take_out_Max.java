import java.util.Arrays;
import java.util.Scanner;

class Take_out_Max{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int[] arrcopy = new int[n];

		
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		 int cnt=0;
		for(int i=0;i<k;i++)
		{
			cnt=arr[i]+cnt;
		}

		int y = k;
		int max=-10000;
	   
		while (y <n ) 
		{
			//System.out.print(cnt+" ");
			cnt=arr[y]+cnt-arr[y-k];
			
			if(cnt>max)
			{
				max=cnt;
			}
			y++;
		}
		System.out.print(max);
	
		System.out.println();

	}
}