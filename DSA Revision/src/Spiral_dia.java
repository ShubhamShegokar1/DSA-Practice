import java.util.Scanner;

public class Spiral_dia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) {
			int n = sc.nextInt();
			int arr[][] = new int[n ][n ];
			int[] array = new int[n * n];

			for (int i = 0; i < n * n; i++) {
				array[i] = sc.nextInt();
			}

			int i = 0;
			int topSide = 0;
			int rightSide = n - 1;
			int bottomSide = n - 1;
			int leftSide = 0;

			int z = 0;
			while (topSide <= bottomSide && leftSide <= rightSide && z < n * n) {
				if (i == 0) {
					for (int j = leftSide; j <= rightSide; j++) {
						arr[topSide][j] = array[z];
						++z;
					}
					topSide++;
				} else if (i == 1) {
					for (int j = topSide; j <= bottomSide; j++) {
						arr[j][rightSide] = array[z];
						++z;
					}
					rightSide--;
				}

				else if (i == 2) {
					for (int j = rightSide; j >= leftSide; j--) {
						arr[bottomSide][j] = array[z];
						++z;
					}
					bottomSide--;
				} else if (i == 3) {
					for (int j = bottomSide; j >= topSide; j--) {
						arr[j][leftSide] = array[z];
						++z;
					}
					leftSide++;
				}

				i++;
				if (i == n) {
					i = 0;
				}
			}

			int digonal1 = 0;
			for (int q = 0; q < n; q++) {
				for (int j = 0; j < n; j++) {
					if (q == j) {
						digonal1 = digonal1 + arr[q][j];

					}
				}
			}

			int digonal2 = 0;
			int cnt = 0;
			for (int q = 0; q < n; q++) {
				for (int j = n - 1; j >= 0; j--) {

					if (cnt % (n + 1) == 0) {
						digonal2 = digonal2 + arr[q][j];
					}
					cnt++;
				}
			}
			if (n > 1 && n % 2 != 0) {
				System.out.println(digonal2 + digonal1 - arr[n / 2][n / 2]);
			} else if (n == 1) {
				System.out.println(arr[0][0]);
			} else {
				System.out.println(digonal2 + digonal1);
			}
		}

	}
}
