import java.util.Scanner;
class pairs
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int target=sc.nextInt();
    int []arr= new int[n];
    int count=0;
    for(int i=0;i<n ;i++)
    {
         arr[i]=sc.nextInt();
    }
    
    for(int i=0;i<n;i++)
    {  
    	if(i!=n-1)
    	{
    	for(int j=i+1;j<n;j++)
        {
    		if(arr[i]+arr[j]==target)
    		{
    			count++;
    		}
        }
    	}
        
    }
    System.out.println(count);
  }
}

