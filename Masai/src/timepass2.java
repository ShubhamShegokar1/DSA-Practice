import java.util.*;
class timepass2
{	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();

	for (int l = 0; l < T; l++) 
	{

		int count = 1;
		int n = sc.nextInt();
		int[]arr = new int[n];
		for (int i = 0; i < n; i++)
		{
				arr[i] = sc.nextInt();	
		}
		
		for (int i = 0; i < n; i++)
		{
				count=count*arr[i];
				System.out.print(count+" ");

		}
		System.out.println();
	}
	
  }  
}

