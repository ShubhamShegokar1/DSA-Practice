import java.util.Arrays;
import java.util.Scanner;

class Stockitup
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
		int n=sc.nextInt();
		int[]arr = new int[7];
	
		for (int i = 0; i < 7; i++)
		{
			arr[i] = sc.nextInt();	
		}
		
		
		int flour=0;
		int rice=0;
		int sugar=0;
		int pulse=0;
		int bread=0;
		int milk=0;
		int oil=0;
		if(arr[0]==1)
		{
			flour=5*110;
		}
		
		
		if(arr[1]==1)
		{
			rice=2*120;
		}
		
		if(arr[2]==1)
		{
			sugar=2*42;
		}
		
		if(arr[3]==1)
		{
			pulse=3*53;
		}
		
		if(arr[6]==1)
		{
			oil=2*126;
			
		}
		
		if(arr[4]==1)
		{
			bread=2*40;
		}
		
		if(arr[5]==1)
		{
			milk=5*32;
		}
		
		
		
		int cost=(flour+rice+sugar+pulse+bread+milk);
		cost=cost+oil;
		
		System.out.println(cost*n);
	
	}
}