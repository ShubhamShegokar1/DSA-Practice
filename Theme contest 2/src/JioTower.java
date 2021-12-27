import java.util.Arrays;
import java.util.Scanner;

public class JioTower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long towers=sc.nextLong();
		long [] arr =new long[n];
		long left=0;
		long right=0; 
		for(int i=0;i<n;i++) 
		{
			
			arr[i]=sc.nextLong();
			if(left<arr[i]) 
			{
				left=arr[i];
			}
			right+=arr[i];
		}

         Arrays.sort(arr);
         for(int i=0;i<n;i++) 
 		{
        	 System.out.print(arr[i]+" ");
 		}
	}

}
