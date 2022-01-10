import java.util.Scanner;
public class NumberOfOccurences 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target=sc.nextInt();
		int arr[]= new int[n];
		for (int i = 0; i < n; i++) {
          arr[i]=sc.nextInt();
		}
		
		int left =0;
		int right=n-1;
		int mid=0;
		boolean b=false;
		while(left<=right) 
		{
			mid=(left+right)/2;
			if(arr[mid]==target) 
			{
				int cnt=0;
				b=true;
				int i=mid;
			    while(i>-1 && arr[i]==target){
			    	i--;
			    	cnt++;
			    }
			    i=mid+1;
			    while(i<n && arr[i]==target){
			    	i++;
			    	cnt++;
			    }
			    System.out.println(cnt);
				break;
			}
			else if(arr[mid]<target) 
			{
				left=mid+1;
			}
			else 
			{
				right=mid-1;
			}
		}
		if(b==false) {
			System.out.println(-1);
		}
	}
}
