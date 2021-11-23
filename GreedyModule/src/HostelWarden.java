
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HostelWarden 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr1= new int[n];
		int[] arr2= new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		int maxTime=0;
		
		for(int i=0;i<n;i++) 
		{
			int temp=arr2[i]-arr1[i];
			
			if(temp<0)
			{
				temp=temp*-1;
			}
			if(temp>maxTime) 
			{
				maxTime=temp;
			}
		}
		System.out.println(maxTime);
	}
}
