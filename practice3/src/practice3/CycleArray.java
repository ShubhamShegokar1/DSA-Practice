package practice3;


import java.util.*;

class CycleArray {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 3
		
	
		int arr[] = new int[n]; // 4 5 6
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
        	
		int max = arr[arr.length - 1];
		int count=0;
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 1; j <= max; j++) 
			{                    
				
				if (arr[i] % j == 0) 
				{
                    count++;
                }				  
				
			}
			
			if(count==3)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}

}
