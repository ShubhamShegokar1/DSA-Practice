import java.util.*;

public class Sum_of_SubArray {
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		   
		    int n=sc.nextInt();
		    int []arr= new int[n];
		    
		    for(int i=0;i<n;i++ )
		    {
		      arr[i]=sc.nextInt();	
		    }
		    
		    
		    int cnt[]= new int[n];
		    int count=0;
		    for(int i=0;i<n;i++)
		    {
		    	count=arr[i]+count;
		    	cnt[i]=count;
		    }
		    
		    //--------------------------------------------
		    int t=sc.nextInt();
		  for(int j=0;j<t;j++)
		  {
			int l=sc.nextInt();
			int r=sc.nextInt();
			
		  /* for(int i=0;i<n;i++)
		    {
	 	      System.out.println(cnt[i]+" ");    	
		    }
		    */
		    if(l==1)
		    {
		     System.out.println(cnt[r-1]);
		   
		    }
		    else
		    {
		    
		    l=l-2;
		    r=r-1;
		          //    System.out.println(l+" "+r);
		         //  System.out.println();
		    System.out.println(cnt[r]-cnt[l]);
		    }
		  } 
	}

}