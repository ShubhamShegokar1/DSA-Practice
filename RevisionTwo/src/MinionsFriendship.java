import java.util.Scanner;

public class MinionsFriendship {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) 
		{
			int n=sc.nextInt();
			int arr[]= new int[n];
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++) 
			{
				arr[i]=sc.nextInt();
				if(min>arr[i]) {
					min=arr[i];
				}
			}
			
			long sum=0;
			for(int i=0;i<n;i++) 
			{
				if(arr[i]!=min) {
					sum+=arr[i]-min;
				}
			}
			System.out.println(sum);
		}
	}
}
