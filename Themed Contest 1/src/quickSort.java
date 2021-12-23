import java.util.Scanner;

public class quickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int left=0;
		int right=n-1;
		int pivot=arr[right];
		int ans[]=solve(left,right,arr,n);
		 for(int a:ans) {
				System.out.print(a+" ");
		 }
	}

	private static int[] solve(int left, int right, int[] arr, int n) {
		
		return null;
	}

}
