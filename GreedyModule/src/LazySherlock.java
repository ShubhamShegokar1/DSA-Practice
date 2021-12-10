import java.util.Arrays;
import java.util.Scanner;

public class LazySherlock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int temp[]= {1,2,5,10,20,50,100,200,500,2000};
		for (int l = 0; l < test; l++) 
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			int finalArr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int ans=Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) 
			{   
				int cnt=0;
				boolean b=false;
				int remainder=arr[i];
				while(b==false) 
				{
					for (int j = 9; j > -1; i--) 
					{
						if(remainder-temp[j]<0) {
							continue;
						}
						else {
							remainder=remainder%temp[j];
						}
						cnt++;
						if(remainder==0) 
						{
							b=true;
						}
						if(ans>cnt) {
							ans=cnt;
						}
					}
				}
				finalArr[i]=cnt;
			}
			
			for (int i = 0; i < n; i++) {
				System.out.print(finalArr[i]+" ");
			}
		}
	}
}
