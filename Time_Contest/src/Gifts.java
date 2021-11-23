import java.util.*;

public class Gifts
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < t; l++) 
		{
			int n=sc.nextInt();
			int arr[]= new int[n];

	        HashMap<Integer, Integer> map = new HashMap<>();
            map.clear();
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			int max=0;
			for(int i=0;i<n;i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
			}
			  int cnt = 0;
			    for(int value = 0, key = 0; value < n; value++)
			    {
			        key = Math.max(map.containsKey(arr[value])? map.get(arr[value]) : 0, key);
			        cnt = Math.max(cnt, value - key + 1);
			        System.out.println(map);
			        System.out.println(cnt);
			        map.put(arr[value], value + 1);
			    }
			System.out.print(cnt);
			System.out.println();
		}

	}

}
