import java.util.Scanner;
public class MergeSort {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp[]= new int[n];

		int left=0;
		int right=n-1;
		solve(left,right,arr, temp);
		 for(int a:arr) {
				System.out.print(a+" ");
			}
	}

	private static void solve(int left, int right, int[] arr, int[] temp) {
		if(left<right) {
			int mid=(left+right)/2;
			solve(left, mid, arr, temp);
			solve(mid+1, right, arr, temp);
			doSolve(left,right,arr, temp);
		}
		return ;
	}

	private static void doSolve(int left, int right, int[] arr, int[] temp) {
		int mid=(left+right)/2;
		int rightStart=mid+1;
		int size=right-left+1;
		int high=rightStart;
		int low=left;
		int index=left;
		while(low<=mid && high<=right) 
		{
			if(arr[low]<=arr[high])
			{
				temp[index]=arr[low];
				low++;
			}
			else
			{
				temp[index]=arr[high];
				high++;
			}
			index++;
		}

		while (low <= mid)
		{
			temp[index]=arr[low];
			low++;
			index++;
		}

		while (high <= right)
		{
			temp[index]=arr[high];
			high++;
			index++;
		}
		System.arraycopy(temp, left, arr, left, size);
	}

}
