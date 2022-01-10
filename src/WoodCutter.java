import java.util.Arrays;
import java.util.Scanner;

public class WoodCutter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long amount = sc.nextLong();
		int right = 0;
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (right < arr[i]) {
				right = arr[i];
			}
		}
		Arrays.sort(arr);
		int left = 0;
		int mid = 0;
		long total = 0;
		boolean b = false;
		while (left <= right) {
			mid = (left + right) / 2;
			total = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] - mid > 0) {
					total += arr[i] - mid;
				}
			}
			if (total == amount) {
				System.out.println(mid);
				b = true;
				break;
			} else if (total > amount) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		if (total < amount)
			System.out.println(mid - 1);
		else
			System.out.println(mid);
	}

}
