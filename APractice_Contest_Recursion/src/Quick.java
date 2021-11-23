import java.util.Scanner;

public class Quick {
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
		int ans[]=find(arr, n,  left, right );
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
static void swap(int[] arr, int i, int j){
	
}

static int partition(int[] arr, int n,int low, int high){
	int pivot = arr[high];
	int i = (low - 1);
	//System.out.println(i+"i ");
	for(int j = low; j <= high - 1; j++)
	{
		if (arr[j] < pivot){
			i++;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	int temp = arr[i+1];
	arr[i+1] = arr[high];
	arr[high] = temp;
	return (i + 1);
}

	private static int[] find(int[] arr, int n,int left, int right) 
	{
		if(left<right)
		{
			int index=partition(arr, n, left, right);
			find(arr, n, left, index-1);
			find(arr, n, index+1,right);
		
		}
	    return arr;
	}

}
