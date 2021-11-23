import java.util.*;
public class count_greater_than_third 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
		for (int l = 0; l < t; l++) 
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
             list.clear();
			int n = sc.nextInt();
			int[] arr = new int[n];
			int[] count = new int[100001];

			for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			for (int i = 0; i < n; i++)
			{
				count[arr[i]]++;
			}
			
			
			int cnt=0;
			for (int i = 0; i <n; i++)
			{
				if(count[i]>n/3)
				{
					cnt++;
					list.add(i);
					//System.out.print(i+" ");
				}
				if(i==n-1)
				System.out.println(cnt);
			}
			//System.out.print(list);
			
			for(int i=0;i<list.size();i++)
			{
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
		}
	}
}
