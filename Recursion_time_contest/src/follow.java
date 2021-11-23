import java.util.Scanner;
import java.text.DecimalFormat;
public class follow 
{
	static boolean bool[][]=new boolean[11][11];

	public static void fun(int i, int j,int n)
	{
		if(n==0)
		{
			bool[i][j]=true;
			return;
		}
			if(i-1>=1 && j-2>=1)
			{
				fun( i-1, j-2,n-1); //2 1
			}
			if(i-2>=1 && j-1>=1)
			{
				fun( i-2, j-1, n-1);
			}
			if(i-2>=1 && j+1<=10)
			{
				fun( i-2, j+1, n-1);
			}
			if(i-1>=1 && j+2<=10)
			{
				fun( i-1, j+2, n-1);
			}
			if(i+2<=10 && j+1<=10)
			{
				fun( i+2, j+1, n-1);
			}
			if(i+1<=10 && j+2<=10)
			{
				fun( i+1, j+2, n-1);
			}
			
			if(i+1<=10 && j-2>=1)
			{
				fun( i+1, j-2, n-1);
			}
			if(i+2<=10 && j-1>=1)
			{
				fun( i+2, j-1, n-1);
			}

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int n=sc.nextInt();
		fun(i,j,n);
		int cnt=0;
		for(int a=0;a<=10;a++)
		{
			for(int b=0;b<=10;b++)
			{
				if(bool[a][b])
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}