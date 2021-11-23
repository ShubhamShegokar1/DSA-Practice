import java.util.Scanner;

public class Recursion_bubble_sort {
public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ans[]= new int[n];
		bubble(arr,0,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
  }

// 1  2  3  6  5
private static void bubble(int[] arr, int i,int n) {
  
	if(n==0) {
	return ; 
  }
	 for (int k=0; k<n-1; k++) 
	 {
	 if(arr[k]>arr[k+1]) {
	  int temp=0;
	  temp=arr[k];
	  arr[k]=arr[k+1];
	  arr[k+1]=temp;
	 }
  }
  bubble(arr,i+1,n-1);

}
 
	


}
