import java.util.*;

public class Can_you_create_Traingle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int l = 0; l < t; l++)
		{

			int n = sc.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) 
			{
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);

			if (n > 2) 
			
			{
				if (arr[n - 1] < arr[n - 2] + arr[n - 3] || (arr[n - 1] == 3 && arr[n - 2] == 1 & arr[n - 3] == 1)) {
					System.out.print("Yes");
				} else {
					System.out.print("No");
				}
			} else 
			{
				System.out.print("No");
			}
			System.out.println();
		}

	}

}
