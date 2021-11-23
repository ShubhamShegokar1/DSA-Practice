import java.util.*;
class pattern5
{	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int space=0;
    int m=0;
	for (int j = n; j >= 1; j--)
	{
		
		for (int i = 0; i < j; i++)
		{
			

			if(i==j-1)
			{
				System.out.print("*");

			}else
			{
				System.out.print("* ");
			}
			
			
		}

		
		
           space=m*2;
           for(int g=0;g<space;g++)
           {
           System.out.print(" ");
           }
		
		m++;
		System.out.println();
	}
    
  }  
}

