import java.util.Scanner;
import java.text.DecimalFormat;
public class follow2 
{
	static int ans=0;
	static boolean bool[][]=new boolean[11][11];

	private static void fun(int i, int j,int n)
	{
		
			if(i-1>=1 && j-2>=1 && n>0)
			{
				ans++;
			 
			}
			if(i-2>=1 && j-1>=1  && n>0)
			{
				ans++;
				
			}
			if(i-2>=1 && j+1<=10  && n>0)
			{
				ans++;
				  
			}
			if(i-1>=1 && j+2<=10  && n>0)
			{
				ans++;
				 
			}
			if(i+1<=10 && j+2<=10  && n>0)
			{
				ans++;
				
			}
			if(i+2<=10 && j+1>=1  && n>0)
			{
				ans++;
				 
			}
			if(i+1<=10 && j-2>=1   && n>0)
			{
				ans++;
				   
			}
			if(i+2<=10 && j-1>=1  && n>0)
			{
				ans++;
				
			}
       
	System.out.println(ans);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int n=sc.nextInt();
		fun(i,j,n);
		
		
	}
}