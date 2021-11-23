import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class streak
{
	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList <String> list = new ArrayList <>();       
    ArrayList <Integer> save = new ArrayList <>();        
    ArrayList <Integer> streak = new ArrayList <>();        

    for(int i=0;i<n;i++)	
    {
         list.add(sc.next());

    }

   //System.out.println(list.get(3).length());
    int count=0;
    int len=0;
    for(int i=0;i<n;i++)
    {
    	count=0;

		//System.out.println(i);
		
    	for(int j=0;j<list.get(i).length();j++)
    	{
    		len=list.get(i).length();
     //    System.out.print(j+" ");
    		if(list.get(i).charAt(j)=='C')
    		{
    			count++;    
    			
    		}
    		   		
    		else
    		{
    	//		System.out.print(count+ " ");
    		if(count>0)
    		{
            save.add(count);  
    		}
    		 count=0;

    		}
    		
    		if(j==len-1)
    		{
    			save.add(count);
    		}
    	}    
    	

    }
    
  //  System.out.println(save);
    
    int count1=0;
    for(int i=0;i<n;i++)
    {
    	count=0;
    	for(int j=0;j<list.get(i).length();j++)
    	{
    		
    		if(list.get(i).charAt(j)=='C' )
    		{
    			count1++;
    		}
    		else
    		{
    			if(count1>0)
    			{
    				streak.add(count1);
    			}
    			count1=0;
    			
    		}
    		
    		
    		
    		
    		
    	}
    	
    }
    

   int max = Collections.max(save);
   int max1 = Collections.max(streak);

  System.out.println(max+" "+max1);
    
  }
     
}

