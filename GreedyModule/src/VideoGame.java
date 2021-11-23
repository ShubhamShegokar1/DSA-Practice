import java.util.Arrays;
import java.util.Scanner;

public class VideoGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		 long k=sc.nextLong();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		long count=0;
		boolean b=true;
		int ans=0;
		for(int i=n-1;i>-1;i--) 
		{
			count+=arr[i];
			ans++;
			if(count>=k) {
		    	b=false;
		    	System.out.println(ans);
				break;
			}
		}
		
		if(b==true)
		System.out.println(n);
		

	}

}
