package practice;
import java.util.Scanner;
public class twoSum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int test=sc.nextInt();
		for(int l=0;l<test;l++) 
		{
           int n=sc.nextInt();
           int target=sc.nextInt();
           int arr[]= new int[n];
           for(int i=0;i<n;i++) {
        	   arr[i]=sc.nextInt();
           }
           int left=0;
           int right=n-1;
           boolean b=false;
           while(left<=right) 
           {
        	   if(arr[left]+arr[right]>target) 
        	   {
        	     	   right--;
        	   }
        	   else if(arr[left]+arr[right]<target) 
        	   {
        	     	   left--;
        	   }
        	   else {
        		   b=true;
        		   System.out.println(left+" "+right);
        		   break;
        	   }
           }
           if(b==false) {
        	   System.out.println("-1 -1");
           }
           
		}
	}
}
