import java.util.Scanner;

public class DpNationStockBroker1 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int l = 0; l < test; l++) 
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			int min[]= new int[n];
			arr[0]=sc.nextInt();
			int minNo=arr[0];
			min[0]=arr[0];
			for(int i=1;i<n;i++) 
			{
		      arr[i]=sc.nextInt();
		      if(arr[i]<minNo) 
		      {
		    	  minNo=arr[i];
		      }
		      min[i]=minNo;
			}
			int ans=0;
			for(int i=0;i<n;i++) 
			{
		      ans=max(ans,arr[i]-min[i]);
			}
			System.out.println(ans);
		}
		
	}

	private static int max(int a, int b) {
		if(a<b) {
			return b;
		}
		else
		return a;
	}

}
