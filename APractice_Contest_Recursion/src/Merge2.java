import java.util.Scanner;

public class Merge2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		int temp[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}	
		merge(arr,temp,0,n-1);
		 for(int a:arr) {
			System.out.print(a+" ");
		}
	}
	private static void merge(int arr[],int temp[], int low, int high) {	
		    if(low>=high) {
		    	return;
		    }
			int mid=(low+high)/2;
			merge(arr,temp,low, mid);
			merge(arr,temp, mid+1, high);
			mergeAll(arr,temp,low, high);
	}
	
	private static void mergeAll(int arr[],int temp[],int low,  int high) {
	 int mid=(low+high)/2;
	 int rightStart=mid+1;
	 int size=high-low+1;
	 
	 int left=low;
	 int right=rightStart;
	 int index=low;
	 while(left<=mid && right<=high) {
		 if(arr[left]<=arr[right]) {
			 temp[index]=arr[left];
			 left++;
		 }
		 else {
			 temp[index]=arr[right];
			 right++;
		 }
		 index++;
	 }
	 
	 while (left <= mid) {
		 temp[index]=arr[left];
		 left++;
		 index++;
     }

	 while (right <= high) {
		 temp[index]=arr[right];
		 right++;
		 index++;
     }
	 System.arraycopy(temp, low, arr, low, size);
	}	
}