import java.util.Scanner;
import java.util.Stack;
public class Nexxt_Greater_even
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for (int l=0;l<test;l++)
		{ 
			Stack<Integer> stk= new Stack(); 
			int n=sc.nextInt();
			int arr[]= new int[n];
			for(int j=0;j<n;j++) {
				arr[j]=sc.nextInt();
			}
		   	find(arr,n);
		}
	}

	private static void find(int[] arr, int n) {
		
	}	
}
