import java.util.*;
class compete
{
	
  public static void main(String [] args)
  {
  int count=0;
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		if(i==0 && arr[i]>arr[i+1])
		{
			count++;
		}
		
		else if(i==arr.length-1 && arr[i]>arr[i-1])
		{
			count++;
		}
		
    	else if(i!=0 && i!=arr.length-1 && arr[i]>arr[i+1] && arr[i]>arr[i-1])

		{
    		    		count++;
			
		}
		
	}
	System.out.println(count);
	
  }
}
