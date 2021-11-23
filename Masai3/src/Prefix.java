import java.util.*;

public class Prefix 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());

		for(int l=0;l<t;l++)
		{
		int n = Integer.parseInt(sc.nextLine());
		//ArrayList <Integer>list=new ArrayList<>();
		String arr[]= new String[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		//  System.out.println(str1.compareTo(str2));
        // System.out.println(str1.indexOf(str2));  
		//System.out.println();
		//System.out.println(str1.substring(5));
		if(n>1)
		{
		int min=5000000;
		for(int i=0;i<n-1;i++)
		{
			if(min>arr[i].length())
			{	
			  min=arr[i].length();
			}
			
		}
		min=min-1;
		int minimum=min;
		//System.out.println(min);
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			if(min==0)
			{
				break;
			}
			for(int j=0;j<n;j++)
			{
			
				if(arr[i].charAt(min)==arr[j].charAt(min))
				{
					//continue;
				}
				else 
				{
					cnt++;
				}
              			
			}
			min--;
	
		}
		
		//System.out.println(cnt);
		boolean flag=true;
		for(int i=1;i<n;i++)
		{
			if(arr[0].charAt(0)!=arr[i].charAt(0))
			{
				flag=false;
				break;
			}
			
		}
		//System.out.println(minimum+" "+cnt);
	//	System.out.println(flag);
		if(flag==true)
		{
			int j=0;
			while(j<=minimum-cnt)
			{
				
			  	System.out.print(arr[0].charAt(j));
               j++;
			}
		
		}
		else
		{
			System.out.print("");
		}
		
		
		}
		else
		{
			int len=arr[0].length();
			for(int i=0;i<len;i++)
			{
			  	System.out.print(arr[0].charAt(i));
			}		
		}
		System.out.println();
	}
		
	}
}
