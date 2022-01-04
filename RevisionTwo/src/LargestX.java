import java.util.Arrays;
import java.util.Scanner;

public class LargestX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) 
		{
			int n=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++) 
			{
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			int i=n-1;
			boolean temp=false;
			while(i>=0 && temp==false) 
			{
				int left = 0;
				int right = i;
				int target=arr[i]*-1;
				while (left <= right && temp==false) 
				{
					int mid = (left+right) / 2;
                    if(arr[mid]==target) {
                    	temp=true;
                    	System.out.println(target*-1);
                    }
                    if(arr[mid]>target) {
                    	right=mid-1;
                    }
                    else {
                    	left=mid+1;
                    }
				}
				i--;
			}
			if(temp==false)
			System.out.println(-1);
			
		}		
	}
}
