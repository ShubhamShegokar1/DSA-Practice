import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AgainanOptimizationProblem {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) {
			int s = sc.nextInt();
			int n = sc.nextInt();

			int weight[] = new int[n];
			int value[] = new int[n];

			int k = 0;
			int i = 0;
			int j = 0;
			while (k < 2 * n) {
				if (k % 2 == 0) {
					weight[i] = sc.nextInt();
					i++;
				} else {
					value[j] = sc.nextInt();
					j++;
				}
				k++;
			}
			
         
			// System.out.println(weight);
			// System.out.println(value);
			System.out.println(solve(s, n, weight, value));
		}
	}
	static int arr[][] = new int[2000][2000];

	private static int solve(int s, int n, int[] weight, int[] value) {

		if (s == 0 || n == -1) {
			return 0;
		}
		
		if (arr[s][n] != 0) {
			return arr[s][n];
		}
		
		int a = 0;
		if (weight[n - 1] <= s) {
			a = value[n - 1] + solve(s - weight[n - 1], n - 1, weight, value);
		}
		
		int b = solve(s , n - 1, weight, value);
		
		arr[s][n] = max(a, b);
		
		return arr[s][n];
	}

	private static int max(int a, int b) {
		if (a > b)
			return a;
		return b;
	}
}
