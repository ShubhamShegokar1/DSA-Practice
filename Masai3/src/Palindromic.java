import java.util.*;

public class Palindromic {
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
			    int one_cnt=0;
			    int two_cnt=0;
			  for(int i=0;i<n;i++)
			  {
				  if(arr[i]==1)
						  {
					         one_cnt++;
						  }
				  else
				  {
					  two_cnt++;
				  }
			  }
			    
			  
			  if(one_cnt%2!=0 && two_cnt%2!=0)
			  {
				  System.out.print("NO" );
			  }
			  else
			  {
				 System.out.print("YES"); 
			  }
			    
		System.out.println();	 
		 }
		 
	}

}
