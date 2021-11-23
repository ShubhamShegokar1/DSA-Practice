import java.util.*;

public class Cipher_String 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int l = 0; l < T; l++) 
		{
			int n = Integer.parseInt(sc.nextLine());
			String str= sc.nextLine();
			int cnt=1;
			if(n==1)
			{
				System.out.print(str.charAt(0)+""+1);
			}
			for(int i=0;i<str.length()-1;i++)
			{
				//System.out.println(i);
				
				
				
				if(str.charAt(i)==str.charAt(i+1) )
				{
					cnt++;
					if(cnt==n)
					{
						System.out.print(str.charAt(i)+""+cnt);
					}
				}
				else
				{
				  System.out.print(str.charAt(i)+""+cnt);
				  cnt=1;
				}
				
			}
			boolean b=false;
			int count=1;
			for( int k=n-1;k>0 && b==false;k--)
			{
				if(str.charAt(k)==str.charAt(k-1))
				{
					count++;
			    }
				else
				{
					System.out.print(str.charAt(k)+""+count);
					b=true;
					
				}
			}
			System.out.println();
			
		}
		
		
	}

}
