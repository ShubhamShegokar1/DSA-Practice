import java.util.*;

public class exist {
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		    int t=sc.nextInt();
		    for(int l=0;l<t;l++)
		    {
		    int n=sc.nextInt();
		    int []arr= new int[n];
		    
		    for(int i=0;i<n;i++ )
		    {
		      arr[i]=sc.nextInt();	
		    }
	
		     int i=0;
		     
		    	for(int j=0;j<n;j++)
		    	{
		    		//System.out.println(j);
		    		
		    		if(arr[j]==i)
		    		{
		    			i++;
		    			if(i==4)
		    			{
		    			System.out.println("YES");
		    			break;
		    			}
	
		    		}
		    		if (j==n-1 && i<3)
	    			{
	    				System.out.println("NO");
	    				break;
	    			}
		    
		    	}
		
		}
		    
	}

}
