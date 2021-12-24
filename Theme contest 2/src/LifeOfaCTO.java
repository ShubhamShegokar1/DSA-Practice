import java.util.Scanner;
public class LifeOfaCTO 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for (int i = 0; i < n; i++) {
          arr[i]=sc.nextInt();
		}
		
		int left =0;
		int right=n-1;
		int mid=0;
		boolean b=false;
		while(left<right) 
		{
			mid=(left+right)/2;
			if(arr[mid]==1) 
			{
			   b=true;	
			   while(mid>-1 && arr[mid]==1) {
				   mid--;
			   }
			   System.out.println(mid+1);
			   break;
			}
			else if(arr[mid]<1) 
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
