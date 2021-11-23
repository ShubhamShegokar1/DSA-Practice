import java.util.Arrays;
import java.util.Scanner;

public class duplicates
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int arr[]= new int[n];
			int k=sc.nextInt();
			for(int j=0;j<n;j++)
			{
				arr[j]=sc.nextInt();
			}
			boolean b= false;
			int max=n-1;
			while(max>0 && b==false)
			{
				for(int a=max-1;a>=0;a--)
				{

					if(arr[max]==arr[a])
					{

						if(max-a<=k)
						{
							//System.out.println(a+" "+max);
							b= true;
							System.out.println("YES");
							break;
						}
					}
				}
				max--;
			}
			
			if(b== false) 
			{
				System.out.println("NO");
			}
			
		}
	}
}
