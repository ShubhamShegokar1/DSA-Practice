import java.util.ArrayList;
import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		find(arr,0);
	}
	static int count=0;
	private static  int[] find(int[] arr, int i ) {
		if(i==arr.length) {
			for(int k=0;k<arr.length;k++) {
				System.out.print(arr[k]+" ");
			}
			return arr;
		}
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			}
		}
		return find(arr, i+1);
	}

}
