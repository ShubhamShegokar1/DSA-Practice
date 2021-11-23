import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BirthdayShopping3{
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int r=sc.nextInt();
			int arr[]= new int[n];
			int ans[]=new int[r];
			find(arr,n,r,0,ans,0);
		}

		private static void find(int[] arr, int n, int r, int index, int[] ans, int i) 
		{
			find(arr, n, r, index+1, ans, i+1);
		}
	}

