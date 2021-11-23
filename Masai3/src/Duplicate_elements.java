import java.util.*;

public class Duplicate_elements {
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		   
		 int t=sc.nextInt();
		 for(int l=0;l<t;l++)
		 {
			ArrayList<Integer> list = new ArrayList<Integer>();
             list.clear();
			 int n=sc.nextInt();
			    
			    for(int i=0;i<n;i++ )
			    {
			    	list.add(sc.nextInt());
			    }
			    
			    Collections.sort(list);   
              // System.out.println(list);
			  
			    if(n>1)
			    {
			    for(int i=0;i<n;i++ )
			    {
			    	int a=list.get(i);
			    	int b=list.get(i+1);
			    			
			    	//System.out.println(list.get(i)+" "+list.get(i+1));
			      if( a == b )
			    	{
			    		System.out.print("YES");
			        	break;
			    	}
			     else if(i==n-2)
			    	{
			    		System.out.print("NO");
			    		break;
			    	}
			    	
			    	 //System.out.print(i+"->"+list.get(i)+"  " );

			    }
			    }
			    else
			    {
			    	System.out.print("NO");
			    }
		
		System.out.println();	 
		 }
		 
	}

}
