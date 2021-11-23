import java.util.Arrays;
import java.util.Scanner;
class Distributing_tressur
{	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int k = 0; k < t; k++) 
		{
			int arr[] = new int[4];
			int arrcopy[] = new int[3];
            int oldarray[]=new int[4];
            int sorted[]=new int[3];

			for (int l = 0; l < 4; l++) 
			{
				arr[l]=sc.nextInt();
			}

			int max=0;
			int total=0;

			for (int i = 0; i < 4; i++) 
			{
				if(arr[i]>max && i<3)
				{
					max=arr[i];

				}
				
				total=total+arr[i];
               
			}
			//--------------------------------------------------------------
			
		//-----------------------------------------------------------------	
			for (int l = 0; l < 4; l++) 
			{
				oldarray[l]=arr[l];
				if(l<3)
				{
				sorted[l]=arr[l];
				}
			}
			
			
		//--------------------------------------------------------------------
			Arrays.sort(sorted);
			for (int l = 0; l < 3; l++) 
			{
				arrcopy[l]=sorted[l];
				//System.out.print(sorted[l]+" ");
			}
			int diff=0;
			//System.out.println(max);
			//System.out.println(arrcopy[0]);
			diff=(max-arrcopy[0]);
			//System.out.println(diff);
			diff=diff+max-arrcopy[1];
			//System.out.println(diff);
			//if(diff<oldarray[3] )
			
       //-------------------------------------------------------------------------------
			
			if(diff>oldarray[3] )
			{
				System.out.println("No");

			}
			else if(total%3==0 )
			{
				System.out.println("Yes");

			}
			else
			{
				System.out.println("No");

			}
		}
	}
}