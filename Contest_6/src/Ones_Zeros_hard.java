import java.util.Scanner;

class Ones_Zeros_hard {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for (int l = 0; l < T; l++)
		{
			int zero=sc.nextInt();
			int one=sc.nextInt();
			int test=2*zero+2;
			//-----------------------------------------------------------------------------
			if(one>test || zero-one>1)
			{
				System.out.println(-1);

			}
			//------------------------------------------------------------------------------
			
			
			else if(zero>one)
			{
				int j=0;
				int i=0;
			    while(i<zero || j<one)
			    {
			    	if(i<zero)
			    	{
			    	System.out.print("0");
			    	i++;
			    	}
			    	if(j<one)
			    	{
			    	System.out.print("1");
			    	j++;
			    	}
			    }
				System.out.println();
			}
			
			else 
			{
			    int cnt=0;
			    test =zero-((zero*2)-one);
			    while(cnt<test)
			    {
			     	System.out.print("110");
			     	cnt++;
			    }
			    
			    int i=cnt/2;
			    int j=cnt;
			    
			    while(j<zero && i<one)
			    {

			    	if(j<one)
			    	{
			    	System.out.print("1");
			    	j++;
			    	}
			    	if(i<zero)
			    	{
			    	System.out.print("0");
			    	i++;
			    	}
			    }
				System.out.println();

			}
				
		}
	}
}