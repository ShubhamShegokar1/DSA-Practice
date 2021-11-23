import java.util.Arrays;
import java.util.Scanner;
class MinMax
{
	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
   
    	int r=0;
        int n=sc.nextInt();
    	int []arr= new int[n];
    	int count=0;
        for(int i=0;i<n ;i++)
        {
             arr[i]=sc.nextInt();   
        }
        Arrays.sort(arr);
        

        if(n<6) {
        	System.out.println("Not Possible");
        	System.out.println("Not Possible");

        }
        else
        {
        if(n>2)
        {
        for(int i=0;i<n ;i++)
        {
        	if(arr[i]!=arr[i+1])
        	{
        		count++;
        		
        	System.out.print(arr[i]+" ");
        		if(count==3)
        		{
        			break;
        		}
        	}
        }
        
        System.out.println();
        
        for(int i=n-3;i<n ;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        }
        //1 1 1 1 1 1
        }
  }
     
}

