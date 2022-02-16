import java.util.Scanner;

public class slidingWindow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int start=0;
		// 1 -2 3 4 -5 6 7 8 9 10  k=3
		
		boolean b=false;
		for(int i=0;i<n-k;i++)
		{
			System.out.println(arr[i]);
			for(int j=start;j<start+k && j<n-k && b==false;j++)
			{
				if(arr[j]<0) {
					System.out.print(arr[j]+" ");
					b=true;
				}
			}
			if(b==false) System.out.println(0);
			b=false;
			if(i>=k) {
				start++;
			}
		}
	}
}
