import java.util.*;
public class Lowest_mode 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
		for (int l = 0; l < t; l++) 
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
            list.clear();
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for (int i = 0; i < n; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			//------------------------
			int max=0;
			for (int i = 0; i < n; i++)
			{
				if(max<arr[i])
				{
					max=arr[i];
				}
			}
			
			int[] count = new int[max+1];
			int[] countcopy = new int[max+1];
			//System.out.println(max);
	        	
			for (int i = 0; i < n; i++)
			{
				count[arr[i]]++;
			}
			
			int high=0;
			for (int i = 0; i <= max; i++)
			{
				if(count[i]>high)
				{
					high=count[i];
				}
				//countcopy[i]=count[i];
	            //System.out.print(count[i]+" ");

			}
			
			//System.out.println(high);
			int counter=-1;
			for (int i = 0; i <= max; i++)
			{
				counter++;
				if(count[i]==high)
				{
					System.out.print(counter);
					break;
				}
				
			}
			
			//-----------------------------------------------------
			//------------------------------------------------------
			/*Arrays.sort(count);
			System.out.println();
			for (int i = 0; i <= max; i++)
			{
	         //   System.out.print(count[i]+" ");

			}
			//-------------------------------------------------------
			
			int cnt=-1;
			for(int i=max;i>=0;i--)
			{
				cnt++;
			  if(count[i]==count[i-1] && count[i]!=0)
			  {
				  cnt=count[i];
				  break;
			  }
			}
			
			System.out.println();
			System.out.println(cnt);
			System.out.println();
			int counter=0;
			for(int i=0;i<max;i++)
			{
				counter++;
			  if(countcopy[i]==cnt)
			  {
		   System.out.print(counter-1);
			 break; 
			 }
			}*/
//---------------------------------------			
			
				System.out.println();
		}
			
    }
}
