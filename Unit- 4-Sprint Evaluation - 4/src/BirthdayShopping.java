import java.util.Scanner;

class BirthdayShopping
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[] = new int[n];
		int temp[] = new int[n];
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}
		find(arr,temp,k,0,n-1,0);
	}

	private static void find(int[] arr, int[] temp, int k, int start, int end, int index) {
		if(index==k) {
			return;
		}
		
		for(int i=start;i<=end;i++) {
			
		}
	}
	
	
}