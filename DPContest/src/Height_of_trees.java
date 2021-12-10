import java.util.HashMap;
import java.util.Scanner;

public class Height_of_trees {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp[] = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = 1;
		}
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int j = 1;
		while (j < n) 
		{   
			for (int i = 0; i < j; i++) 
			{
				if(arr[i]<arr[j] && temp[i]+1 > temp[j]) 
				{
					temp[j]++;
				}
			}
			System.out.println();
			j++;
		}
		int max=0;
		for(int a:temp) {
			if(a>max) {
				max=a;
			}
		}
		System.out.println(max);
	}
}
