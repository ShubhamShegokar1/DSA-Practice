import java.util.*;
public class Find_closet_sum 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> list= new ArrayList<>();
		for (int l = 0; l < t; l++) 
		{

			int n = sc.nextInt();
			int k=sc.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);


		int sum=0;
		for(int i=0;i<n-2;i++)
		{
			int p1 =i+1;
			int p2=n-1;
			while(p1<p2)
			{
				
		      sum=arr[i]+arr[p1]+arr[p2];
				if(sum>k)
				{
					p2--;
				}
				else 
				{
					
				} 
				
				
			}
		}
				
			System.out.print(sum);
		}
	}
}
