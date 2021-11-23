import java.util.Arrays;
import java.util.Scanner;

public class Two_sum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
        
		for (int l = 0; l < t; l++) 
		{
		 int n=sc.nextInt();
		 int target=sc.nextInt();
		 int  arr[]= new int[n];

		 for(int i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
		 }

		 boolean b=false;
			int cnt=0;

		 for(int i=0;i<n && b!=true ;i++)
		 {
			// System.out.println();
			//System.out.print(i+" -> ");
			//System.out.println();
			 for(int j=i+1;j<n;j++)
			 {
			    	cnt++;

				 //System.out.print(j+" ->j  ");
			    if(arr[i]+arr[j]==target)
			    {
			    	System.out.print(i+" "+j);
			    	b=true; 
			        break;
			    }    
			    else if(i==(n-2) && i==j-1)
			    {
			       System.out.print("-1 -1");
                    break;
			    }
			    
			 }
		 }
		 System.out.println();
		}

	}

}
