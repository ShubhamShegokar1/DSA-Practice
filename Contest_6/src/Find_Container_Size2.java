import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Find_Container_Size2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n  = Integer.parseInt(sc.nextLine());
		String str=sc.nextLine();
		int arr[][]= new int[n][n];
		
		for(int i=0;i<n;i++)
        {
			int cnt=0;
			for(int j=0;j<n;j++)
			{
				if(str.charAt(i)==str.charAt(j) )
				{
					cnt++;
				}
				arr[i][j]=cnt;
			}
        }

		for(int i=0;i<n;i++)
        {
			for(int j=0;j<n;j++)
			{
		//	 System.out.print(arr[i][j]+" ");
			}
			//System.out.println();
        }
		int tests=sc.nextInt();
	 ArrayList <Integer> list = new ArrayList<Integer>();
	 list.clear();
	 int left=0;
	 int right=0;
		for(int c=0;c<tests;c++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int i=a-2;
			left=i;
			int j=b-1;
			right=j;
			int row=0;
			while(row<n)
			{
				int subtraction=arr[row][j]-arr[row][i];
			 list.add(subtraction);
			 row++;
			}
		}
		System.out.println(list);
		
	}
}