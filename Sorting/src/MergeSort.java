import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr,temp,0,n-1);
	}

	private static void sort(int[] arr, int[] temp, int low, int high) 
	{
		if(low<high) {
	  	int mid=(low/high)/2;
	  	sort(arr, temp, low, mid);
	  	sort(arr, temp, mid+1, high);
        merge(arr, temp, low, high);
		}
	}

	private static void merge(int[] arr, int[] temp, int low, int high) 
	{
		
	}
}
