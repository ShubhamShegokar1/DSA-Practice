import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for(int l=0;l<test;l++) {
		    int c1=sc.nextInt();
		    int c2=sc.nextInt();
		    int c3=sc.nextInt();
		    int n=sc.nextInt();
			int arr[] = new int[n];
			int maxDay=0;
			for (int i = 0; i < n; i++) 
			{
				arr[i] = sc.nextInt();
				if(maxDay<arr[i]) {
					maxDay=arr[i];
				}
			}
			int arr1[]=new int[maxDay];
			
			
		}
		System.out.println();
	}
}
