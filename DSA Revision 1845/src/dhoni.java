import java.util.ArrayList;
import java.util.Scanner;

public class dhoni 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		ArrayList <Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]==7)
			{
				list.add(i);
			}
		}
	
		
		int p=0;
		int q=0;
		int ans=0;
		for(int i=0;i<list.size();i++)
		{
		  if(i==0)
		  p=list.get(i)+1;
		  else
		  {
			  p=list.get(i)-list.get(i-1);
		  }
		  
		  q=n-list.get(i);
		  ans+=p*q;
		  
		}
		System.out.println(ans);
		
		
	}

}
