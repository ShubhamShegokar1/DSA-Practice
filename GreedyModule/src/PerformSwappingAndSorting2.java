import java.util.Arrays;
import java.util.Scanner;

public class PerformSwappingAndSorting2 {

	static void minimizeWithKSwaps(int arr[], int n, int k) {
		for (int i = 0; i < n - 1 && k > 0; ++i) {

			int pos = i;
			for (int j = i + 1; j < n; ++j) {

				if (j - i > k)
					break;

				if (arr[j] < arr[pos])
					pos = j;
			}

			int temp;

			for (int j = pos; j > i; --j) {
				temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}

			k -= pos - i;
		}
	}

	// Driver method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
        int k=sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		minimizeWithKSwaps(arr, n, k);

		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
	}
}
