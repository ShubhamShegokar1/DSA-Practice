import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for(int l=0;l<test;l++) 
		{
			int n=sc.nextInt();
			int arr[]= new int[n];
			int index[]= new int[n];
			int allcnt=0;
			for(int i=0;i<n;i++) 
			{
				arr[i]=sc.nextInt();
				if(arr[i]==0) {
					index[i]++;
					allcnt++;
				}
			}
		
				Arrays.sort(arr);
				int zeroCount=0;

				for(int j=0;j<n;j++) 
				{
					if(index[j]==1) 
					{
						zeroCount++;
					}
					else {
						break;
					}
				}
				


				int index1=0;
				for(int i=zeroCount;i<n;i++) {
					if(arr[i]!=0) {
						index1=i;
						System.out.print(arr[i]);
						break;
					}
				}

				for(int i=0;i<allcnt;i++) {
					System.out.print(0);
				}

				for(int i=index1+1;i<n;i++) {
					System.out.print(arr[i]);
				}
				System.out.println();
			}

	}

}
