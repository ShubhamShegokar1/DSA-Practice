import java.util.*;
public class Find_pairs_of_3_with_zero_sum 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList <Integer> list = new ArrayList<Integer> ();
		for (int l = 0; l < t; l++) 
		{
          list.clear();
			int n = sc.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Arrays.sort(arr);
		/*	for (int i = 0; i < n; i++)
			{
				System.out.print(arr[i]+" ");
			}
						System.out.println();

			*/
			int cnt=0;
			
		
		for(int i=0;i<n-2;i++)
		{
			if(i>0 && arr[i]== arr[i-1])
			{
				continue;
			}
			
			int p1 =i+1;
			int p2=n-1;
			while(p1<p2)
			{
				if(p2<arr.length-1 && arr[p2]==arr[p2+1])
				{
					p2--;
					continue;
				}
				
				if(arr[i]+arr[p1]+arr[p2]==0 )
				{
					list.add(arr[i]);
					list.add(arr[p1]);
					list.add(arr[p2]);
					cnt++;
					p1++;
					p2--;

				}
				else if(arr[i]+arr[p1]+arr[p2]<0)
				{
					p1++;
				}
				else
				{
					p2--;
				}

			}
		}
				
			System.out.println(cnt);
			//System.out.println(list.size());
			int space=1;
			for(int i=0;i<list.size();i++)
			{
				System.out.print(list.get(i)+" ");
				if(space%3==0)
				{
					System.out.println();
				}
				space++;

			}
		}

	}

}
