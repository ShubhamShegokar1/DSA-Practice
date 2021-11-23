import java.util.*;
class Noddy
{	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int level=sc.nextInt() ; 
    int arr[]= new int[n];
    for(int i=0;i<n;i++)
    {
    	arr[i]=sc.nextInt();
    }
    int count=0;
    int skip=0;
    for(int i=0;i<n;i++)
    {
    	if(arr[i]<=level)
    	{
    		count++;
    		
    	}else 
    	{
    		skip++;
    		if(skip==2)
    		{
    			break;
    		}
    	}
    		
    	
    	

    }
  
    /*
         7 6
         4 3 7 6 7 2 2
      */
  }  
}

