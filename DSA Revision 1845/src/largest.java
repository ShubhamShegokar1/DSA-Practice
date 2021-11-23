import java.util.Scanner;
public class largest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			
			int arr[]= new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			int left=0;
			int right=n-1;
			while(left<right)
			{
				int mid=(left+right)/2;
				if(arr[mid]<arr[right])
				{
					right=mid;
				}
				else		
				{
					left=mid+1;
				}
				//System.out.println(left+" "+right);
			}
			
			if(n==1)
			System.out.println(arr[0]);
			else if(left-1==-1)
			System.out.println(arr[n-1]);
			else
			System.out.println(arr[left-1]);

	}	
}
