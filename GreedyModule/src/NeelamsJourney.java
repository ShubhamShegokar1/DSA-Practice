import java.util.Arrays;
import java.util.Scanner;
public class NeelamsJourney 
{public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
    }
    long ans=0;
    int index=0;
    for(int i=0;i<n;i++) 
    {    	
    	if(arr[index]>arr[i]) 
    	{
    		ans+=Math.abs(index-i)*arr[index];
    		index=i;
    		//System.out.println(ans);
    	}
    }

    ans+=(n-index)*arr[index];
    System.out.println(ans);
}
}
