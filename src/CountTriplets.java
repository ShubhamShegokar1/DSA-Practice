import java.util.Scanner;

public class CountTriplets {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long target=sc.nextInt();
		long arr[]= new long[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		long cnt=0;
		for(long i=0;i<n-2;i++) 
		{
			long left=i+1;
			long right=n-1;
			while(left<=right) 
			{
			   long mid=(left+right)/2;
			   long temp=arr[(int) right]-arr[(int) i];
			   if(temp<target)
			   {
				   cnt+=right-left;
				   left=mid+1;
			   }
			   else {
				  right=mid-1;
			   }
			}

		}
		System.out.println(cnt);
	}

}
