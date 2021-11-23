import java.util.*;

public class Rotate_Elements_by_K {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int l = 0; l < t; l++) 
		{

			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
			// ------------------------------------------
			//Logic starts from here
			
			int count = 0;
			int total = 0;
			int result = 0;
			if (n < k) 
			{
				int remainder = k % n;
				 //System.out.println(remainder);
                
				count = n - (n - remainder);
				//System.out.println(count);
				result = n - count;
			//	System.out.println(result);

				for (int i = result; i < n; i++) 
				{
					System.out.print(arr[i] + " ");
				}
				int i = 0;
				k = k - remainder;
				// System.out.println(k+" <- k");
				while (total < n-remainder) 
				{
					total++;
				 //   System.out.print("total "+total);
					System.out.print(arr[i] + " ");
					i++;
				}

			} 
			
			else
			{
				int start = n - k;
				// System.out.println(start);
				for (int i = start; i < n; i++) 
				{
					System.out.print(arr[i] + " ");
				}
				for (int i = 0; i < start; i++) 
				{
					System.out.print(arr[i] + " ");
				}
			}

			System.out.println();
		}

	}

}
