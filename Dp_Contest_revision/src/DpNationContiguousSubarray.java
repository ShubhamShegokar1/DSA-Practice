import java.util.Scanner;

public class DpNationContiguousSubarray {

	public static void main(String[] args) 
	{
      Scanner sc= new Scanner(System.in);
      int test=sc.nextInt();
      for(int l=0;l<test;l++) 
      {
    	int n=sc.nextInt();  
        int arr[]= new int[n];
        long sum=Long.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        long maxEnding=0;
        for(int a=0;a<n;a++)
        {
        	maxEnding+=arr[a];
        	if(maxEnding<arr[a])
        	{
        		maxEnding=arr[a];
        	}
        	if(maxEnding>sum) {
        		sum=maxEnding;
        	}
        }
           System.out.println(sum);  
      }
	}

}
