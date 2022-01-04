import java.util.Scanner;

public class MaximumSumarray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) 
		{
			int n=sc.nextInt();
			int arr[]= new int[n];
			long bigNo=Long.MIN_VALUE;
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				if(bigNo<arr[i]) {
					bigNo=arr[i];
				}
			}
			long sum=0;
			long max=0;
			for(int i=0;i<n;i++) {
				sum=sum+arr[i];
				if(sum<arr[i]) 
				{
					sum=arr[i];
				}
				if(max<sum) {
					max=sum;
				}
			}
			if(max==0)
			System.out.println(bigNo);
			else
			System.out.println(max);
		}
	}

}
