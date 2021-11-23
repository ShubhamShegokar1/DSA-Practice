package practice2;

import java.util.ArrayList;
import java.util.Scanner;

class abc3 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test cases");
		int T = sc.nextInt();
		
		int z = 0;
		int z1=0;
		int count = 0;

		for (int s = 0; s < T; s++) 
		{
			
			System.out.println("Enetr gap");
			int K = sc.nextInt(); // 2

			ArrayList<Integer> arr = new ArrayList<Integer>();
		
			arr.add(11);
			arr.add(22);
			arr.add(33);
			arr.add(44);
			arr.add(55);
			arr.add(66);
			arr.add(67);
			arr.add(68);
			arr.add(69);
			// 1 2 3 4 5 6 7 8 9
			 
			for (int i = arr.size()-1; i >= (arr.size()-K); i--)          
			{
				z=i;
			}
			
		    
			for ( int j=z;j<arr.size();j++) 
			{				
				count++;				
				System.out.print(arr.get(j)+" ");
			}
			
		}

	}
}
