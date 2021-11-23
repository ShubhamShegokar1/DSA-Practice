import java.util.*;

public class Chintu {
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		    int t=sc.nextInt();
            for(int k=0;k<t;k++)
            {
		    int n=sc.nextInt();
		                                                      
		    if(n==1)
		    {
		    	System.out.print(1);
		    }
		    
		    else if(n<10 && n>1 )
		    {
		    	
		    		System.out.print(n);
		    	
		    	
		    }else
		    {                     //10973
		    	int count=0;
		    	while(n>9)
		    	{
		    		count=count+10;
		    		//System.out.println("count "+count);
		    		 n=n-10+1;
		    		// System.out.println("n "+n);
		    		 if(n<10)
		    		 {
		    			 count=count+n;
		    		 }
		    		
		    	}
	    		System.out.print(count);
		    }		    
           System.out.println();
            }
 
	}
}
