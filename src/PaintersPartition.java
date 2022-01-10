import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class PaintersPartition 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long days=sc.nextLong();
		long [] arr =new long[n];
		long left=-1;
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

		
		while(left<=right) 
		{
		 long mid = (left+ right) / 2;
		  int count=check(arr,n,mid);
		  if(count>days) 
		  {
			  left=mid+1;
		  }
		  else 
		  {
			  right=mid-1;
		  }
		}
		 DecimalFormat formatter = new DecimalFormat("#");
         System.out.println(formatter.format(left));
	}

	private static int check(long[] arr, int n, long mid) {
		long total=0;
		int painters=1;
		for(int i=0;i<n;i++) 
		{
			total+=arr[i];
			if(total>mid) 
			{
				total=arr[i];
				painters++;
			}
		}
		return painters;
	}
}
