import java.util.Scanner;

class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int  left=0;
		int right=n-1;
		int[] ans=find(arr,n,left,right);
		for(int i=n-1;i>-1;i--) {
			System.out.print(ans[i]+" ");
		}
	}
private static int[] find(int[] arr, int n, int left, int right) 
{	
		if(left<right) {
			int index=divide(arr, n, left, right);
			find(arr, n, left, index-1);
			find(arr, n, index+1,right);
		}
		return arr;
		
	}
	//	5
//	2 3 1 4 5
	private static int divide(int[] arr, int n, int left, int right) {
		int pivot =arr[right];
		int j=(left-1);
        for(int i=left;i<=right-1;i++) {
        	if(arr[i]<pivot) {
        		j++;
        		int temp=arr[j];
        		arr[j]=arr[i];
        		arr[i]=temp;
        	}
        }
        
        int temp=arr[j+1];
		arr[j+1]=arr[right];
		arr[right]=temp;
		return (j+1);
	}
	
	
	
	
	

}