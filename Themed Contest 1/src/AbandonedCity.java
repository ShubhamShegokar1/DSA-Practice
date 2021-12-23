import java.util.Scanner;

public class AbandonedCity {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) {
			int n = sc.nextInt();
			long sum = sc.nextLong();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			boolean b = false;
			long curr_sum = arr[0];
			int start = 0;
			int i;
			int min=0;
			for (i = 1; i <= n; i++) 
			{

				while (curr_sum > sum && start < i - 1) 
				{
					if(min>start-i) 
					{
						min=start-1;
					}
					curr_sum = curr_sum - arr[start];
					start++;
				}

				if (curr_sum == sum) 
				{
					if(min>start-i) {
						min=start-1;
					}
					b = true;
				}
				if (i < n) {
					curr_sum = curr_sum + arr[i];
				}
			}
			
				System.out.println(min);
			

		}

	}

}
