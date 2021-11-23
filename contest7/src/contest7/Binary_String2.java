package contest7;

import java.util.Scanner;
import java.util.Stack;

public class Binary_String2
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int coin1=sc.nextInt();
		int coin2=sc.nextInt();
		int max=0;
		int min=0;
		if(coin1>=coin2)
		{
			max=coin1;
			min=coin2;
		}
		else
		{
			max=coin2;
			min=coin1;

		}
	    sc.nextLine();
	    int zero_cnt=0;
	    int one_cnt=0;
		String str=sc.nextLine();
		int zero=0;
		int one=0;
		for(int i=0;i<n;i++)
		{
		  if(str.charAt(i)=='0')
		  {
			  zero++;
		  }
		  else
			  one++;
		}
		int maxx=0;
		int minn=0;

		if(one>zero)
		{
			maxx=one;
		}
		else
		{
			minn=zero;
		}
		
		if(max==coin1)
		{
			int cnt=0;
			for(int i=0;i<n-1;i++)
			{
				if(str.charAt(i)=='0' && str.charAt(i+1)=='1')
				{
					cnt=cnt+coin1;
					zero_cnt++;
					one_cnt++;
				}
				else if( (str.charAt(i)=='1' && str.charAt(i+1)=='0') )
				{
					cnt=cnt+coin2;
					zero_cnt++;
					one_cnt++;
				}
			}
			
			System.out.println(cnt);
		}
		else
		{
			int cnt=0;
			for(int i=0;i<n-1;i++)
			{
				if(str.charAt(i)=='1' && str.charAt(i+1)=='0')
				{
					cnt=cnt+coin2;
					zero_cnt++;
					one_cnt++;
				}
				else if(i<n-2 && (str.charAt(i)=='0' && str.charAt(i+1)=='1') && str.charAt(i+2)!='0')
				{
					cnt=cnt+coin1;
					zero_cnt++;
					one_cnt++;
				}
			}
			//-----------------------------------
			int add=0;
			if(maxx-zero>0 )
			{
				add=maxx-zero;
			}
			System.out.println(cnt+(add*min));
			//------------------------------------
		}
		
		
	}
}
