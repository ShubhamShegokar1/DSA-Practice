package practice2;

import java.util.ArrayList;
import java.util.Scanner;

class abc2 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int z = 0;
		int count = 0;

		for (int s = 0; s < T; s++) 
		{
			int N = sc.nextInt(); // 5
			int K = sc.nextInt(); // 2

			ArrayList<Integer> arr = new ArrayList<Integer>();
			System.out.println("Enter elements");

			for (int i = 0; i <N; i++) 
			{
				arr.add(sc.nextInt());
			}
			
			
			for (int i = arr.size()-1; i >= (arr.size()-K); i--)          
			{
				z = i;

			}
		    for ( int j=z;j<arr.size();j++) 
			{				
				count++;				
				System.out.print(arr.get(j)+"-");
			}
			
			int result = N - count;
			for (int i = 0; i < result; i++)
			{
				System.out.print(arr.get(i));
				 if(i<result)
					{
						System.out.print("-");
					}
			}
			 
		}

	}
}
