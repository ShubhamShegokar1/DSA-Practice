import java.util.*;
public class Magical_pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		for (int l = 0; l < t; l++) 
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
             list.clear();
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
		//-----------------------------------------------------	
			int one=0;
			int zero=0;
			for(int i=0;i<n;i++)
			{
			  if(arr[i]==0)
			  {
				  zero++;
			  }
			  else if(arr[i]==1)
			  {
				  one++;
			  }
			}
			int diff=0;
			if(one-zero>=0)
			{
				diff=one-zero;
			}else
			{
			  diff=zero-one;
			}
			
		//---------------------------------------------------
			int min=0;
			if(one>zero)
			{
				min=zero;
								
			}else
			{
				min=one;
			}
			
			
		//---------------------------------------------------
			int zerocnt=0;
			while(zerocnt<min)
			{
				System.out.print(0+" "+1+" ");
				zerocnt++;
			}
			for(int i=0;i<diff;i++)
			{
				if(min==one)
				{
				System.out.print(0+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}
			
    }
}
