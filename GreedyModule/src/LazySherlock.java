import java.util.Arrays;
import java.util.Scanner;

public class LazySherlock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) 
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println(arr[1]);
			
		}
	}
}
