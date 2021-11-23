import java.util.*;

public class Reverse_String_in_grp
{
	public static void main(String[] args) 
	{
		//use flag
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < t; l++) 
		{
		int n = Integer.parseInt(sc.nextLine());
		String str=sc.nextLine();
		int len=str.length();
		
		//-----------------------------------------
		if(n<len)
		{
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		int count=n;

		while (count < len) 
		{
			if (len - count >= n + n) 
			{
				for (int i = count; i < count + n; i++)
				{
					System.out.print(str.charAt(i));
				}
				 count = count + n;
			
				for (int j = count+n-1; j >= count ; j--) 
				{
				  System.out.print(str.charAt(j));
				}
				count=count+n;
			} 

			
			else 
			{
				for (int i = count; i < len; i++) 
				{
					System.out.print(str.charAt(i));
				}
				count=len;
			}
		}
	    
	    
		}
		else
		{
			for(int i=len-1;i>=0;i--)
			{
				System.out.print(str.charAt(i));
			}
		}
	    System.out.println();
		}
	}
}
