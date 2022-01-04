import java.util.Arrays;
import java.util.Scanner;

public class EatingMangoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int test=Integer.parseInt(sc.nextLine());
	    for(int l=0;l<test;l++) 
	    {
           int n=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			long minTime=arr[0];
			for(int i=1;i<n;i++)
			{
				if(arr[i-1]>arr[i]) {
					
				}
				else if(arr[i-1]<arr[i]) {
					
				}
				else {
					
				}
			}
			System.out.println(minTime);
	    }
	}

}
