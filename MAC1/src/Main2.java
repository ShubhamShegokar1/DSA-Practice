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
			for(int i=0;i<n;i++) 
			{
				arr[i]=sc.nextInt();
			}
		    boolean b=false;
		    int cnt=0;
		    Arrays.sort(arr);
			for(int i=0;i<n-1;i++) 
			{
				for(int j=i+1;j<n;j++) 
				{
					if(arr[i]*2==arr[j]) {
						cnt++;
						b=true;
					}
				}
			}
			if(b==false) {
				System.out.println(0);
			}
			else {
				System.out.println(cnt);
			}
		}
	}
   
}
