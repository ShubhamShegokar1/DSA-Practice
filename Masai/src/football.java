import java.util.*;
class football
{
	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String arr[]= new String[n];
    int count=0;
    ArrayList <Integer> list = new ArrayList <>();       

    for(int i=0;i<n;i++)
    {
       arr[i]=sc.next();
    }
    
    if(n>1)
    {
    for(int i=0;i<n;i++)
    {
    	count=0;
    	for(int k=0;k<n;k++)//0
    	{
    		if(arr[i].equals(arr[k]) )
    		{
    			//System.out.println(arr[k]);
    			count++;

    		} 		
    		if(k==n-1)
    		{
    			list.add(count);
    		}
    		
    	}
    	
     
  }
    
    int max1 = Collections.max(list);
    int index= list.indexOf(max1);
    //System.out.println(index);
    System.out.println(arr[index]);
    
    }else
    {
    	System.out.println(arr[0]);
    }
    		}
  }

