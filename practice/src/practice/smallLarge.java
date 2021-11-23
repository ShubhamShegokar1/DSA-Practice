package practice;

import java.util.*;

public final class smallLarge {
	static int i = 0;

	public static void main(String[] args) {
		System.out.println("Enter Elements");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter Elements");
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

		Arrays.sort(arr);

		System.out.print("Smallest");
		System.out.println(arr[0]);
		System.out.print("Largest");

		System.out.println(arr[n - 1]);

	}
}
