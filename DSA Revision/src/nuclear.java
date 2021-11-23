import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class nuclear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];	
		int max=0;
		int index=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>max)
			{
				max=arr[i];
				index=i;
				System.out.println();
			}
		}
		int i=index;
		while(i<n)
		{
			if(i<n-1 && arr[i]>=arr[i+1] || i==n-1)
			{
			System.out.print(arr[i]+" ");
			int current=i;
			int back=i-1;
			while(back>-1)
			{
				
				if(arr[current]==arr[back]+1)
				{
					System.out.print(arr[back]+" ");
					current=back+1;
				}
				back--;
			}
			}
			System.out.println();
			
			i++;
		}
				
	}
}