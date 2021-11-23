import java.util.*;

public class Pyramid {
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		    
		    int n=sc.nextInt();
		    int count=0;
		    int result=0;
		    for(int i=1;i<=n;i++)
		    {
		    	for(int j=0;j<i+1;j++)
		    	{
		    		count=count+j;
                  
		    	}
		    	result++;
		    	if(count>n)
		    	{
		    	System.out.println(result-1);
		    	break;
		    	}
		    }
		
	}

}
