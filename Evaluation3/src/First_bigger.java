import java.util.Arrays;
import java.util.Scanner;
class First_bigger
{	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
			int n=sc.nextInt();
			int[]arr = new int[n];

			for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();	
			}
			int q=sc.nextInt();
              Arrays.sort(arr);
            
			for(int i=0;i<q;i++)
			{
				int a=sc.nextInt();
				int ans=0;
				boolean b=false;
				for(int j=0;j<n;j++)
				{
					if(arr[j]>a)
					{
						ans=arr[j];
						break;
					}
					else if(arr[n-1]==a)
					{
						b=true;
						
						break;
					}
				}
				if(ans!=0)
				{
				System.out.println(ans);
				}
				else 
				{
					System.out.print(-1);
				}

			}
			System.out.println();
		
	}
}