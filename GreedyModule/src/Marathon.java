import java.util.Arrays;
import java.util.Scanner;

public class Marathon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n * 2];
		for (int l = 0; l < n * 2; l++) {
			arr[l] = sc.nextInt();
		}
		boolean b = false;
		int j = -2;
		int start=0;
	boolean status=false;
		while (b == false) 
		{
			int energy = 0;
			int distance = 0;
			j = j + 2;
			boolean a = false;
			start=j;
			int i=0;
			for ( i = j; i < n * 2 && a==false; i = i + 2) 
			{
				energy += arr[i];
			    //System.out.println(energy + " " + arr[i + 1]);
				if (arr[i + 1] > energy) 
				{
					a=true;
				}
				else if(arr[i + 1] < energy){
					energy=energy-arr[i+1];
				}
			}
			//System.out.println(i+" --i");
			if (i==2*n && arr[i-1]<energy) 
			{
				b = true;
			}
		    if(j==n) {
		    	status = true;
		    	b = true;
		    }
		}
		if(status==false)
		System.out.println(j/2);
		else
		System.out.println("No starting points");
	}
}
