import java.util.Scanner;

public class CountTriplets {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		int cnt=0;
		for(int i=0;i<n-2;i++) 
		{
			int left=i+1;
			int right=n-1;
			int ans=0;
			while(left<right) 
			{
				if(arr[right]-arr[i]<=target) 
				{
					System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
					left++;
					ans++;
					
				}
				
				else {
					right--;
				}
			}
		     // counter += ((ans-i)*(ans - i - 1))/2;
			cnt+=(ans-i+1)*2;
		}
		System.out.println(cnt);
	}

}
