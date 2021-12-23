import java.util.Scanner;

public class PerformSwappingAndSorting2 {
	static void minimizeWithKSwaps(int arr[], int n, int k) 
	{
		for (int i = 1; i < n; i++) 
		{
			    int j = i;
			    boolean b=false;
				while (b==false && j - 1 > -1 && k > -1) 
				{
					if ( arr[j - 1] > arr[j]) 
					{
					  arr = swap(arr, j, j - 1);
					  k--;
					  j--;
					}
					else 
					{
						b=true;
					}
				}
		}
		for (int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	private static int[] swap(int[] arr, int j, int i)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int k = sc.nextInt();
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			minimizeWithKSwaps(arr, n, k);
		}
	}
}
