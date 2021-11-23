package practice;

import java.util.*;

class TestClass {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter TEst");
		int t = sc.nextInt();
		System.out.println("Enter no of element");
		int n = sc.nextInt(); // 5
		System.out.println("Enter no of rolls");

		int k = sc.nextInt(); // 2
		int arr[] = new int[n];
		System.out.println("Enter elements");
		try {
			for (int i = 0; i < n; i++) 
			{
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) 
			{

				if (arr[i] == arr[n - 1]) 
				{
					arr[n] = arr[0 + k];
				}
				arr[i] = arr[i + k];

			}
		}
		
		catch (Exception e)
		{
			for (int i = 0; i < n; i++)
			{
				System.out.print(arr[i] + " ");
			}
		}

	}
}
