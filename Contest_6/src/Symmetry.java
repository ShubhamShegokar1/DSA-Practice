import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Symmetry 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		ArrayList <String> list = new ArrayList<>();
		for (int l = 0; l < T; l++) 
		{
			int n=Integer.parseInt(sc.nextLine());
			
			char[][] arr = new char[n][n];
			boolean bool[]= new boolean[2];
			for(int i=0;i<n;i++)
			{
				String str= sc.nextLine();

				for(int j=0;j<n;j++)
				{
					arr[i][j]=str.charAt(j);
				}
			}

			
            int i=0;
            int j=0;
            boolean a=true;
            int p1=0;
            int p2=n-1;
			while(p1<p2)
			{
				if(arr[p1][i]!=arr[p2][j])
				{

					a=false;
				}
				i++;
				j++;
				if(i==n-1)
				{
					p1++;
					p2--;
                    i=0;
                    j=0;
				}
			}
			bool[0]=a;

	//-------------------------------------------------------------------		
			i=0;
			j=0;
			a=true;
		    p1=0;
	        p2=n-1;
			while(p1<p2)
			{
				if(arr[i][p1]!=arr[j][p2])
				{

					a=false;
				}
				i++;
				j++;
				if(i==n-1)
				{
					p1++;
					p2--;
					i=0;
					j=0;
				}
						
			}
			
			bool[1]=a;
//--------------------------------------------------------			
			if(bool[0]==true && bool[1]==true )
			{
				System.out.print("BOTH");
			}
			else if(bool[0]==false && bool[1]==false)
			{
				System.out.print("NO");
			}
			else if(bool[0]==true)
			{
				System.out.print("HORIZONTAL");
			}
			else
			{
				System.out.print("VERTICAL");
			}
			
			System.out.println();
		}
	}
}