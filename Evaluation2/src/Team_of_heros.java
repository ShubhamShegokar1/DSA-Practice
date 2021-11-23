import java.util.*;

public class Team_of_heros 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int l = 0; l < T; l++) 
		{
			int n= sc.nextInt();
			int k=sc.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			boolean b= false;
			for(int i=0;i<n-1 && b==false;i++)
			{
				
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]+arr[j]==k)
					{
						b=true;
						System.out.print("Yes");
						break;
					}
					else if(i==n-2 )
					{
						b=true;
						System.out.print("No");
						break;
					}
				}
				
			}
			
			
			System.out.println();
			
		}
		
		
	}

}
