import java.util.Arrays;
import java.util.Scanner;

public class Lifeboats {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
	
			
			int start=0;
	 		int end=n-1;
			int cnt=0;
					
			while (start <= end) {
				
				   int check=0;
		            if(start != end)
		            	check = arr[start] + arr[end];	
		            else
		            {
		            	check=arr[start];
		            }
			  if(check>k) 
			  {
				  cnt++;
				  end--;
			  }
			  else
			  {
				  start++;
				  end--;
				  cnt++;
			  }
			}
			System.out.println(cnt);
		}
	}
}
