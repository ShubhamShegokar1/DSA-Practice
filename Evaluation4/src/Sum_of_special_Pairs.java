import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_special_Pairs
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int ans=0;
		int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
      
        int diff=0;
        int i=0;
        while(i<n-1)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		int test=0;
        		boolean b=false;
        		test=j-i;
        		for(int m=2;m<=test/2;m++)
        		{
        			if(test%m==0)
        			{
        				b=true;
        				break;
        			}
        		}
        	  
        		if(b==false && test!=1)
        		{
  
        			diff=arr[j]-arr[i];
        			if(diff<0)
        			{
        				diff=diff*-1;
        			}
        			//System.out.println(arr[j]+" "+arr[i]+" "+(j-i)+" "+diff);
        			ans=ans+diff;
        		}
        	}
        	i++;
        }
        System.out.println(ans);
	}
}
