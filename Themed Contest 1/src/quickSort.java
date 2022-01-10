import java.util.Scanner;

public class quickSort {
    static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int left=0;
		int right=n-1;
		solve(left,right,arr);
		 for(int a:arr) {
				System.out.print(a+" ");
		 }
	}

	private static void solve(int left, int right, int[] arr) {
		if(left<right) {
			int index=partition(left,right,arr);
			solve(left, index-1, arr);
			solve(index+1,right, arr);
		}
	}

	private static int partition(int left, int right, int[] arr) {
		int pivot=arr[right];
		int i=left-1;
		//System.out.println(left+" ========================"+ right);
		for(int j=left;j<right;j++) {
			//System.out.println(arr[j]+" pivot: "+pivot);
			if(arr[j]>pivot) {
				//System.out.println(i);
				i++;
				swap(i,j,arr);
			}
		}
		++i;
		swap(i,right,arr);
//		 for(int a:arr) {
//				System.out.print(a+" ");
//		 }
		// System.out.println();
		return i;
	}

	private static void swap(int i, int j, int[] arr) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	

}
