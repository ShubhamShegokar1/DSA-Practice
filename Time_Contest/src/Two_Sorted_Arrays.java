import java.util.*;
import java.util.Scanner;

public class Two_Sorted_Arrays
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < t; l++) 
		{
			int n=sc.nextInt();
			int arr1[]= new int[n];
			int arr2[]= new int[n];

			for(int i=0;i<n;i++)
			{
				arr1[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				arr2[i]=sc.nextInt();
			}
			
			int p1=0;
			int p2=n-1;
			int cnt=0;
			while(p1<n || p2>0)
			{
			   //  System.out.println("p1 :"+p1);
			    // System.out.println("p2 :"+p2);
               if(p1<n && p2>-1)
               {
				if(arr1[p1]==arr2[p2] )
				{
					//System.out.print(arr1[p1]);
					p1++;
					p2--;
					cnt++;
				}
				else if(arr1[p1]>arr2[p2])
				{
					p2--;
				}
				else if(arr1[p1]<arr2[p2])
				{
					p1++;
				}
               }
				else 
				{
					break;
				}

			}
			
		 System.out.print(cnt);
		 System.out.println();
		}

	}

}
